package com.exadel.questions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "My test";
        System.out.println("Input: " + input);
        char[] charArray = input.toCharArray();
        System.out.println("Original Array: " + Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("Sorted Array: " + Arrays.toString(charArray));
        StringBuilder sbd = new StringBuilder();
        sbd.append(charArray);
        System.out.println("Final String: " + sbd);
    }
}