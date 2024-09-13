package org.example;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rnd = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(21) * 2;
            System.out.printf("%d ", numbers[i]);
        }


        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();


        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num != min && num != max) {
                sum += num;
                count++;
            }
        }


        double avg = (double) sum / count;


        System.out.println("\nСреднее арифметическое без учета минимального и максимального: " + avg);
    }
}
