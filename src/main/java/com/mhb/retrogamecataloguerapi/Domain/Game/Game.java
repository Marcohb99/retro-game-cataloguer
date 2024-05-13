package com.mhb.retrogamecataloguerapi.Domain.Game;

import com.mhb.retrogamecataloguerapi.Domain.Price.Price;

public class Game {

        private final String name;
        private final Price price;

        public Game(String name, Price price) {
            this.name = name;
            this.price = price;
        }

        public String name() {
            return name;
        }

        public Price price() {
            return price;
        }
}
