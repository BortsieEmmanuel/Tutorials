package Exercises.Methods;

public class lowerTriangleSum {
    public static void main(String[] args){

        int[][] Arr = {{2,4,6,1},{8,4,6,3},{7,2,6,3}};
            int Nc = Arr[0].length;
            int sum = 0;

            for (int i = 0; i <= (Nc-1); i++){
                for (int j = 0; j<=i; j++){
                     sum +=Arr[i][j];
                }
                System.out.println("The sum is :"+sum);
            }
    }
}
