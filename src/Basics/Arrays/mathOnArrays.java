package Basics.Arrays;

public class mathOnArrays extends AbstractClass {
    /**
     * In a 2D Array_function, find the sum of row[4] and col[0] but not their last element
     * What you can, you code.
     **/
    @Override
    public  int row_col(int[][] Arr, int sum) {
        int i, j;
        sum = 0;
        for(j=0; j<=Arr.length-1; j++){
            if(j == 3) continue;
            sum  += (Arr[3][j] + Arr[j][0]);
        }
        return sum;
    }

    }

