package de.h90.coin;

import org.junit.jupiter.api.Test;

class FlipTest {

    @Test
    void testFlip() {
        Flip flip = new Flip();
        int fail = 0;
        for (int i = 0; i < 1000; i++) {
            if (!flip.check(143)) {
                fail++;
            }
        }
        System.out.println(fail);
    }
}
