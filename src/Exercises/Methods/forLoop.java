package Exercises.Methods;

public class forLoop {
    public static void main(String args[]){
        for(int i = 4; i<=40; i+=2){
            System.out.print(" "+i);
        }
        System.out.println();

        int j = 4;
        while(j <=40){
            System.out.print(" "+j);
            j+=2;
        }
        System.out.println();
        int k = 4;
        do {
            System.out.print(" "+k);
            k+=2;
        }while (k<=40);

    }
}
