package com.qjiang;

import java.util.Arrays;

public class ManhattanDistance {
    public static int manhattanDistance(Point p1, Point p2) {
        int[] p1Str = Arrays.stream(p1.toString().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] p2Str = Arrays.stream(p2.toString().split(",")).mapToInt(Integer::parseInt).toArray();

        return Math.abs(p1Str[0] - p2Str[0]) + Math.abs(p1Str[1] - p2Str[1]);
    }
}
