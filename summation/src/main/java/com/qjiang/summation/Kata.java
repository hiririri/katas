package com.qjiang.summation;

public class Kata {
    public static int sum(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0");
        }
        return number == 1 ? 1 : number + sum(number - 1);
    }
}
