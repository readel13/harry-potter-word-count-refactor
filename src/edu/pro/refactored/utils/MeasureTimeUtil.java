package edu.pro.refactored.utils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class MeasureTimeUtil {

    public static <T> void measureTime(Consumer<T> methodToMeasure, T value) {
        var start = Instant.now();
        methodToMeasure.accept(value);
        var finish = Instant.now();

        System.out.println("------");
        System.out.println(ChronoUnit.MILLIS.between(start, finish));
    }
}
