package Exercises.Methods;

import java.util.Scanner;

public class Function {
    // This is the function: Finds sum of numbers from 0 to N, where N is the number of input
    public static  int func(){
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter an integer value");
        int n = userInput.nextInt();
        for(int i =0; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    // The second question
    public static double formula() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the vale for N");

        int n = value.nextInt();
        double expression;
        expression = n * ((n + 1) / 2);

        return expression;
    }
    // The main function
    public static void main(String[] args){
        System.out.println(formula());
        System.out.println(func());
    }
}
