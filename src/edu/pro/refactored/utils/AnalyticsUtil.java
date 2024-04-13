package edu.pro.refactored.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalyticsUtil {

    public static void generateAnalytic(String filePath) {
        var contentFile = FileUtil.readFile(filePath);
        var words = WordUtil.getWords(contentFile);

        var result = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(30)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

        result.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
    }
}
