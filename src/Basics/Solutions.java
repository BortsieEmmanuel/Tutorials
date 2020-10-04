package Basics;

public class Solutions {
    public static void main(String []args){
        System.out.println("The product of corresponding elements of A and B");
        int []A = {1,2,3,4,5};
        int []B = {6,7,8,9,10};
        int []C = new int[5];
        int sum = 0;
        for(int ind = 0; ind<5; ind++){
            C[ind] = A[ind]*B[ind];

            System.out.print(" "+C[ind]);
        }
        System.out.println();
        System.out.println("the sum of product");
        for(int j = 0; j<5; j++){
            sum = sum+C[j];
            //C[ind] = sum;
        }
        System.out.print(sum);
    }
}
