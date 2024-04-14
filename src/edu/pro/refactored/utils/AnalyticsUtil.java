package edu.pro.refactored.utils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalyticsUtil {

    public static void generateAnalytic(String filePath) {
        var contentFile = FileUtil.readFile(filePath);

        WordUtil.getWords(contentFile).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Map.Entry.comparingByValue(Comparator.reverseOrder()))))
                .stream()
                .limit(30)
                .forEach((entry) -> System.out.printf("%s: %s%n", entry.getKey(), entry.getValue()));
    }
}
