package Basics.controFlow;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        char e = 'e';
        int res = 0;

        while (true){
            System.out.println("Number : ?");
            int number = scanner.nextInt();

            System.out.println("operator : ");
            //char operator = (char) scanner.next();

            System.out.println("Number : ?");
            int number1 = scanner.nextInt();

            char operator = ' ';
            if(operator == '+'){
                res = number+number1;
                System.out.println(res);
            }
        }

    }
}
