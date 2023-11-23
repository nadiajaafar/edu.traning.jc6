package edu.traning.jc6;

import java.util.Random;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random= new Random ();

        System.out.println("Введите количество элементов в массиве:");
        int n = scanner.nextInt();
        int [] array = new int[n];

        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) ;
        }

        for (int i : array) {
            if ( i % 2 == 0) {
                evenNum++;
            }
        }

        if (evenNum == 0 ) {
            System.out.println("В данном массиве нет четных чисел");

        }

          int[] evenArr = new int [evenNum];
            for (int i = 0, j = 0; i <array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenArr[j++] = array[i];
                }
            }
        System.out.println();
            for (int i: evenArr){
                System.out.println(i + "");
            }
    }
}
