package com.mhb.retrogamecataloguerapi.Domain.Game;

import com.mhb.retrogamecataloguerapi.Domain.Price.Price;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GameTest {
    @Test
    public void testGame() {
        Game game = new Game("Super Mario Bros", new Price(123));
        assertEquals("Super Mario Bros", game.name());
        assertEquals(123, game.price().price());
    }
}
