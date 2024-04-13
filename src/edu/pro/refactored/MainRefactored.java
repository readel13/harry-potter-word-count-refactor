package edu.pro.refactored;

import edu.pro.refactored.utils.AnalyticsUtil;
import edu.pro.refactored.utils.MeasureTimeUtil;

public class MainRefactored {

    public static final String FILE_PATH = "src/edu/pro/txt/harry.txt";

    public static void main(String[] args) {
        MeasureTimeUtil.measureTime(AnalyticsUtil::generateAnalytic, FILE_PATH);
    }
}
