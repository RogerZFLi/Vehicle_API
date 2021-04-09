package com.udacity.vehicles;


import com.udacity.vehicles.domain.car.Car;
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

public class VehiclesApiApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void listPost() {
        ResponseEntity<Car> responseEntity =
                this.testRestTemplate.getForEntity("/cars", Car.class);
        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }


    @Test
    public void getUpdateDelete() {
        ResponseEntity<Car> responseEntity =
                this.testRestTemplate.getForEntity("/cars?vehicleId=1", Car.class);
        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }


}
