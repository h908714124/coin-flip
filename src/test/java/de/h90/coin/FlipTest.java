package de.h90.coin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FlipTest {

    @Test
    void testFlip() {
        Assertions.assertFalse(new Flip().flip143());
    }
}
