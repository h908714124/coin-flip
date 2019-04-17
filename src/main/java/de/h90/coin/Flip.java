package de.h90.coin;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

class Flip {

    boolean check(int times) {
        long count50 = stream(0.5).limit(times).filter(Boolean::booleanValue).count();
        long count60 = stream(0.6).limit(times).filter(Boolean::booleanValue).count();
        return count60 > count50;
    }

    private Stream<Boolean> stream(double prob) {
        return Stream.generate(() -> {
            double v = ThreadLocalRandom.current().nextDouble();
            return prob > v;
        });
    }
}
