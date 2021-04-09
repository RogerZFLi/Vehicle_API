package com.udacity.pricing;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class PricingServiceApplicationIntegrationTests {
//	@LocalServerPort
//	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

//	private final static String BASE_URL = "http://localhost:";
	private final static String SUFFIX_URL = "/services/price";

	@Test
	public void contextLoads() {
	}

	@Test
	public void getRandomPrice(){
		ResponseEntity<String> responseEntity =
				this.testRestTemplate.getForEntity(SUFFIX_URL + "?vehicleId=2", String.class);
		Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
	}

	@Test
	public void getRandomPriceFailedWithWrongEndpoint(){
		ResponseEntity<String> responseEntity =
				this.testRestTemplate.getForEntity(SUFFIX_URL, String.class);
		Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.BAD_REQUEST);
	}




}
