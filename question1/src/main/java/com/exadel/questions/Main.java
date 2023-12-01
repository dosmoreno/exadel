package com.exadel.questions;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 15 == 0) {
                System.out.println("C");
            } else if(i % 3 == 0){
                System.out.println("A");
            } else if(i % 5 == 0){
                System.out.println("B");
            }
        }
    }
}