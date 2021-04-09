package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(PricingController.class)
//@TestPropertySource(properties = {"management.port=0"})
public class PricingServiceApplicationUnitTests {

    @Autowired
    private MockMvc mvc;

    @Mock
    private PricingService pricingService;

    @Test
    public void getRandomPrice() throws Exception{
        mvc.perform(get("/services/price?vehicleId=2"))
                .andExpect(status().isOk());
        verify(pricingService, times(1)).getPrice(2L);
    }


}
