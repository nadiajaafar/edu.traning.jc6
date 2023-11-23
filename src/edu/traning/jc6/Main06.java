package edu.traning.jc6;

import java.util.Random;

public class Main06 {
    public static void main(String[] args) {

        int [] array = new int [10];

        int max;
        int min;
        int diff;

        Random rand = new Random();

        for ( int i = 0;i < array.length; i++){
            array[i] = rand.nextInt(10);

        }

        max = array[0];
        min = array [0];

        for (int i =0; i < array.length; i++) {
            if ( array [i] < min) {
                min = array [i];
            }
            if (array [i] > max) {
                max = array [i];

            }
        }
        diff = max - min;

        System.out.println("Наименьшая длина числовой оси = " + diff);
    }


}
