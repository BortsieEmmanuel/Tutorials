package Basics;

import java.util.Scanner;

public class practices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short Age;
        String country;
        System.out.println("Enter Age");
        Age = input.nextShort();

        System.out.println("Enter country");
        country = input.next().toUpperCase();


        if((Age >= 18) && (country.equals("GHANA"))){
            System.out.println("You qualified to vote");
        }else {
            System.out.println("Your are not qualified to vote");
        }
    }
}
