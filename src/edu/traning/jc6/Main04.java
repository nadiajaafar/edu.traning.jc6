package edu.traning.jc6;

import java.util.Scanner;

public class Main04 {

//    Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
//    будет ли она возрастающей.
    public static void main(String[] args) {

        int[] array = new int [5];
        boolean check1 = true;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){

            System.out.println("[" + i + "] =>");
            array[i] = scanner.nextInt();

        }

         for (int i = 0; i <array.length - 1; i++ ) {
             if (array[i] > array[ i + 1]) {
                 check1 = false;
             }
         }

         if (check1 == false) {

             System.out.println("Последовательность не возрастающая");
         }

         else {
             System.out.println("Последовательность возрастающая");

         }
    }
}
