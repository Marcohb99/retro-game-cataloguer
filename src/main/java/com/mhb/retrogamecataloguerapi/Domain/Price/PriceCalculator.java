package com.mhb.retrogamecataloguerapi.Domain.Price;

import com.mhb.retrogamecataloguerapi.Domain.Game.Game;

import java.util.Map;
import java.util.Set;

public class PriceCalculator {
    Map<Integer, Float> priceMap;

    public PriceCalculator(Map<Integer, Float> priceMap) {
        this.priceMap = priceMap;
    }

    public float calculatePrice(Game game, Integer units) {
        Set<Integer> unitPrices = priceMap.keySet();
        float unitPrice = 0.0f;
        while (unitPrices.size() > 0) {
            Integer next = unitPrices.iterator().next();
            if (units < next) {
                unitPrice = priceMap.get(next);
                break;
            }
            unitPrices.remove(next);
        }
        return unitPrice * units;
    }
}
