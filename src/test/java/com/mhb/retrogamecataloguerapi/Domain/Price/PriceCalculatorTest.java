package com.mhb.retrogamecataloguerapi.Domain.Price;

import com.mhb.retrogamecataloguerapi.Domain.Game.Game;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceCalculatorTest {
    @Test
    public void testPriceCalculator() {
        PriceCalculator priceCalculator = new PriceCalculator(
                Map.of(
                        2, 299.0f,
                        10, 239.0f,
                        25, 219.0f,
                        50, 199.0f,
                        100, 179.0f
                        )
        );
        Price price = new Price(123);
        Game game = new Game("Super Mario Bros", price);
        float result = priceCalculator.calculatePrice(game, 20);
        assertEquals(4380, result);
    }
}
