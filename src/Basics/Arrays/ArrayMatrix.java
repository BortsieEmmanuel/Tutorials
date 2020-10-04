package Basics.Arrays;

public class ArrayMatrix {
    public static void main(String[] args){
        int[][] A = {
                {1,4,5,6},
                {1,2,3,4},
                {10,2,3,4}
        };
        int[][] B = {
                {8,5,4,5},
                {3,1,8,2},
                {0,1,5,4}
        };
        int[][] C = new int[3][4];

        int Nr=A[0].length;//since A[0].length = B[0].length then I will use one of them
        int sum=0, i, j;

        for(i=0; i<Nr; i++){
            System.out.print("{");
            for (j=0; j<=Nr-1; j++){
                sum = (A[i][j] +B[i][j]); // adding individual cells
                C[i][j]=sum; //storing each sum at Cij cell

                System.out.print(C[i][j]+",");// print each sum in the cells of Array C
            }

            System.out.println("}");
        }
        System.out.println(Nr);
    }
}