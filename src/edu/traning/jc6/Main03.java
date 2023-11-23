package edu.traning.jc6;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {


        int[] array = new int[4];

        int negativeMem = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] =>");
            array[i] = scanner.nextInt();

        }

        if (array[0] < 0) {
            negativeMem++;

        }

        if (negativeMem > 0) {
            System.out.println("Отрицательное число встречается раньше");
        } else {
            System.out.println("Положительное число встречается раньше");
        }
    }
}

