package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] names = {"One", "Two", "Three", "For", "Five"};
        int [] nums = {500, 300, 200, 400, 100};

        display(names);
        display(nums);

        Arrays.sort(names);
        Arrays.sort(nums);

        display(names);
        display(nums);
    }

    public static void display(String[] elems) {
        System.out.println("\nСтроковой массив:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }

    public static void display(int[] elems) {
        System.out.println("\nЦелочисленный массив:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }
}
