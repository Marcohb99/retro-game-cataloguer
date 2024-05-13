package com.mhb.retrogamecataloguerapi.Domain.Price;

import com.mhb.retrogamecataloguerapi.Domain.Game.Game;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class PriceCalculator {
    private final Map<Integer, Float> priceMap;
    private final Float minimumPrice;

    public PriceCalculator(SortedMap<Integer, Float> priceMap, Float minimumPrice) {
        this.priceMap = priceMap;
        this.minimumPrice = minimumPrice;
    }

    public float calculatePrice(Game game, Integer units) {
        if (units == 0) {
            return 0.0f;
        }

        for (Map.Entry<Integer, Float> entry : this.priceMap.entrySet()) {
            if (units <= entry.getKey()) {
                return entry.getValue() * units;
            }
        }

        return this.minimumPrice * units;
    }
}
