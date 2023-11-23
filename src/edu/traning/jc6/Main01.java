package edu.traning.jc6;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
//
//        В массив A [N] занесены натуральные числа.
//        Найти сумму тех элементов, которые кратны данному К.

        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        System.out.println("Введите размер массива");
        int [] A = new int[N];

        System.out.println("Введите элементы массива");

        for (int i = 0; i < N; i++) {

            A[i] = scanner.nextInt();
        }
        System.out.println("Введите значение K:");
        int K = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }


    }
}