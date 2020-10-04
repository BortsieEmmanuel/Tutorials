package Basics.Arrays;

public class Transpose {
    public static void main(String []args){
        int [][] trans={

                {3,2,1,14},
                {4,8,9,22},
                {10,11,13,4},
                {4,6,2,8,9}
        };

        int [][]Transpose = new int[4][4];

        int nc = trans[0].length;
        int nr = trans.length;
        int i, j;

        System.out.println("This is the main matrix");
        for( i=0; i<nr; i++){
            for ( j=0; j<nc; j++){

                System.out.print(trans[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("This is the transpose matrix");
        for( i=0; i<nc; i++){
            for ( j=0; j<nr; j++){

                Transpose[i][j] = trans[j][i];

                System.out.print(trans[j][i]+" ");
            }
            System.out.println(" ");
        }

        //finding the product and sum of the matrix and it transpose
        int prod = 0, sum = 0;
        for (i=0; i<nr; i++){
            for (j = 0; j<nc; j++){
                prod += (trans[i][j]*Transpose[i][j]);
                sum  += (trans[i][j]+Transpose[i][j]);
            }
        }
        System.out.println("The product of the matrix and its transpose is : "+prod);
        System.out.println("The sum of the transpose and its transpose is : "+sum);
    }
}
