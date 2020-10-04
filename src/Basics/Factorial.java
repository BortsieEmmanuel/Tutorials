package Basics;

public class Factorial {
    public static void main(String[] args){
        int n = 6;// Assuming n is 6
        int fact = 1;
        double E = 0.0;

        for(int i = 1; i<=n; i++){
            fact *=i;
            E = E + (1 / fact);

        }

        System.out.println("The factorial of "+n+" is equal to "+fact);
        System.out.println(E);
    }

}
