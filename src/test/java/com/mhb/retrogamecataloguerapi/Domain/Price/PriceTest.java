package com.mhb.retrogamecataloguerapi.Domain.Price;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceTest {

    @Test
    public void testPrice() {
        Price price = new Price(123);
        assertEquals(123, price.price());
    }
}
