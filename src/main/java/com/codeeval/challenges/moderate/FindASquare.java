package com.codeeval.challenges.moderate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindASquare {

    public static void main(String[] args) {
        String line = "(4,6), (5,5), (5,6), (4,5)";
        String[] lines = line.split(", ");
        final List<Node> points = Stream.of(lines)
                .map(point -> point.replaceAll("\\(|\\)", ""))
                .map(point -> new Node(Integer.valueOf(point.split(",")[0]), Integer.valueOf(point.split(",")[1])))
                .collect(toList());

    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
