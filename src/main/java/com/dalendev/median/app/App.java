package com.dalendev.median.app;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author daniele.orler
 */
public class App {

    public static void main(String[] args) {

        Histogram histogram = new Histogram();
        RollingMedianCalculator rollingMedianCalculator = new RollingMedianCalculator(histogram);

        Scanner stdin = new Scanner(System.in);
        String line;
        while(stdin.hasNextLine() && !(line = stdin.nextLine()).equals("")) {
            Pattern.compile("\\s*,\\s*")
                .splitAsStream(line)
                .mapToInt(Integer::parseInt)
                .forEach(rollingMedianCalculator::ingestSample);
        }

        System.out.println(rollingMedianCalculator.calculateMedian());
    }

}
