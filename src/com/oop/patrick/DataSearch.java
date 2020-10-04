package com.oop.patrick;

public class DataSearch {

    public static int biSearch(int[]arr, int var, int i, int j){


            int mid = i + (j-i)/2;

            if (arr[mid]==var)
                return mid;

            if(var >arr[mid])
                return biSearch(arr, var, mid+1, j);

            else if (var<arr[mid])
                return biSearch(arr, var, i, mid-1);

      return 1;
    }
}
