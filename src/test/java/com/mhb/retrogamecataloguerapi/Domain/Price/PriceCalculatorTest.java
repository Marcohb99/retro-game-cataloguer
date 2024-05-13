package com.mhb.retrogamecataloguerapi.Domain.Price;

import com.mhb.retrogamecataloguerapi.Domain.Game.Game;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceCalculatorTest {
    static Collection<Object[]> provideUnitsAndExpectedPrice() {
        return Arrays.asList(new Object[][] {
                {0, 0.0f},
                {1, 299.0f},
                {2, 598.0f},
                {5, 1195.0f},
                {10, 2390.0f},
                {15, 3285.0f},
                {20, 4380.0f},
                {25, 5475.0f},
                {30, 5970.0f},
                {50, 9950.0f},
                {100, 17900.0f},
        });
    }
    @ParameterizedTest
    @MethodSource("provideUnitsAndExpectedPrice")
    public void testPriceCalculator(Integer units, Float expectedPrice) {
        // Given
        SortedMap<Integer, Float> priceMap = new TreeMap<>();
        priceMap.put(2, 299.0f);
        priceMap.put(10, 239.0f);
        priceMap.put(25, 219.0f);
        priceMap.put(50, 199.0f);
        priceMap.put(100, 179.0f);
        PriceCalculator priceCalculator = new PriceCalculator(priceMap, 179.0f);
        Price price = new Price(123);
        Game game = new Game("Super Mario Bros", price);

        // When
        float result = priceCalculator.calculatePrice(game, units);

        // Then
        assertEquals(expectedPrice, result);
    }
}
