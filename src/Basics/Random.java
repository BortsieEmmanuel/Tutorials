package Basics;

import java.util.Scanner;

public class Random {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess the your number ?");
        int user = userInput.nextInt();
        int guess = (int) (Math.random() * 10);

        System.out.println(guess);
        if(user==guess) {
            System.out.println(" You're correct\n"+" your number is : "+user+"\n and the guess number is : "+guess);
        }else {
            System.out.println(" You're wrong\n"+" your number is : "+user+"\n the the guess number is : "+guess);
        }
    }
}
