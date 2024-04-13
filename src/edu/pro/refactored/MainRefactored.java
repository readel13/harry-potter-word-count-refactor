package edu.pro.refactored;

import edu.pro.refactored.utils.AnalyticsUtil;
import edu.pro.refactored.utils.FileUtil;
import edu.pro.refactored.utils.MeasureTimeUtil;
import edu.pro.refactored.utils.WordUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainRefactored {

    public static final String FILE_PATH = "src/edu/pro/txt/harry.txt";

    public static void main(String[] args) {
        MeasureTimeUtil.measureTime(AnalyticsUtil::generateAnalytic, FILE_PATH);
    }
}
