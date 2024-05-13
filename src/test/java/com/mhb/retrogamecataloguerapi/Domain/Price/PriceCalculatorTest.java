package com.mhb.retrogamecataloguerapi.Domain.Price;

import com.mhb.retrogamecataloguerapi.Domain.Game.Game;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceCalculatorTest {
    @Test
    public void testPriceCalculator() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Price price = new Price(123);
        Game game = new Game("Super Mario Bros", price);
        float result = priceCalculator.calculatePrice(game, 20);
        assertEquals(2460, result);
    }
}
