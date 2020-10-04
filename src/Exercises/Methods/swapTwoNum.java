package Exercises.Methods;

public class swapTwoNum {
    public static void main(String[] args){
        int a = 8, b = 10, temp;
        System.out.println("Before swapping the value of 'a' is " +a+ " and the value of b is "+b);

        temp = a; // the value of 'a' into temp

        a = b;   // now, a is empty and ready to accept the value b so just drop it there.

        b = temp; // and also 'b' is now empty since its value has assigned to a. then go ahead and put the value of 'a' stored in the temp from the beginning
        System.out.println("After swapping, the value of a is: "+a+" and the value of b is: "+b);
    }
}
