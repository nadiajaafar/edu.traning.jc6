package edu.traning.jc6;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        int[] array = new int[3];

        int countZero = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] =>");
            array[i] = scanner.nextInt();

            if (array[i] == 0) {
                countZero++;
            }

        }

        int[] newArray = new int[countZero];
        for (int j = 0, k = 0; j < array.length; j++) {

            if (array[j] == 0) {
                newArray[k] = j;
                k++;
            }
        }
        for (int n = 0; n < newArray.length; n++) {
            System.out.println(("ar[" + n + "]=" + newArray[n]));

        }


    }
}
