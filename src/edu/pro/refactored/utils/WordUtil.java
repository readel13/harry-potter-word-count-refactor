package edu.pro.refactored.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class WordUtil {

    public static List<String> getWords(String content) {
        if (content == null || content.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        for (var word : cleanText(content).split(" ")) {
            if (!word.isBlank()) {
                result.add(word.trim());
            }
        }

        return result;
    }

    private static String cleanText(String text) {
        return text.replaceAll("[^A-Za-z ]", " ").toLowerCase(Locale.ROOT);
    }
}
