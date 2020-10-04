package Exercises.Methods;

public class arrayComputation {
    public static void main(String[] args) {
        int A[] = {5, 6, 7, 4, 3, 6, 7, 3, 6, 7, 23, 8,75};

        int min = A[0],  max = A[0],   i; double sum = 0;

        for (i = 1; i <= A.length - 1; i++) {
        //printing the max and min number of the array
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }

        //Print the sum of the array
        for(i = 0; i<=A.length-1; i++){
            sum += A[i];
        }

        //print the average of the array
        double avg = sum/A.length;

        // getting the middle number
        int mid = A.length/2;

        //sorting an array

        System.out.println("Array size is : "+A.length);
        System.out.println("max = "+max+"\nThe last two number is: "+A[A.length-2]);
        System.out.println("min = "+min+" \nThe median is: "+A[mid]);
        System.out.println("The sum is : "+sum);
        System.out.println("the average of the array is : "+avg);
    }
}
