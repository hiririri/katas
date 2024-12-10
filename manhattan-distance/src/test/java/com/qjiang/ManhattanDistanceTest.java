package com.qjiang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanDistanceTest {

    @Test
    void shouldReturnZero() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        assertEquals(0, ManhattanDistance.manhattanDistance(p1, p2));
    }

    @Test
    void shouldReturnOne() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        assertEquals(1, ManhattanDistance.manhattanDistance(p1, p2));
    }

    @Test
    void shouldReturnThree() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(0, 3);
        assertEquals(3, ManhattanDistance.manhattanDistance(p1, p2));
    }

    @Test
    void shouldReturnFour() {
        Point p1 = new Point(5, 4);
        Point p2 = new Point(3, 2);
        assertEquals(4, ManhattanDistance.manhattanDistance(p1, p2));
    }

}