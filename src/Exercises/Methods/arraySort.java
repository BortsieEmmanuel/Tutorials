package Exercises.Methods;

import java.util.Arrays;

public class arraySort {
    public static void main(String[] args){
        int [] array = new int[10];

        for ( int i = 0 ; i < array.length ; i++ ) {
            array[i] = ((int)(Math.random()*100+1));
        }

        Arrays.sort( array );
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print(" "+array[i]);
        }
    }
}
