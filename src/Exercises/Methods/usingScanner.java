package Exercises.Methods;

import java.util.Scanner;

public class usingScanner {
    public static void main(String[] args){

        Scanner value = new Scanner(System.in);
        System.out.println("Enter the value for N");

        int n = value.nextInt();
        double formula;
        formula = n*((n+1)/2);
        System.out.println(formula);
    }
}
