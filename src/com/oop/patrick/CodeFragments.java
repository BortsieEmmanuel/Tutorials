package com.oop.patrick;

import java.util.Arrays;

public class CodeFragments {
    /***************************************method overriding********************/
    public static class A{
        public double sum(int a, int b){
            double res = a+b;
        return res;
        }
    }

    public static class inherSum extends A{
        //inheriting a method for the class A
        @Override
        public double sum(int a, int b) {
            return super.sum(a, b);
        }
    }

    /**************************************Method overLoading************************/
    public static double methodA(int a, int b){
        double mult = a*b;
        return mult;
    }

    public static float methodA(double b, double c){
        double mult = b*c;
        return (float) mult;
    }

/***********************************************BinarySearch************************************************************/
    public static int BiSearch(int []Search, int mid, int k) {
        int l = 0;
        int h = Search.length - 1;
        if (h >= l) {
            mid = l + (h - l) / 2;
            if (Search[mid] == k)
                return mid;
         else if (Search[mid] >= k)

            return BiSearch(Search, mid - 1, k);

        else if (Search[mid] < k)
            return BiSearch(Search, mid + 1, k);
        else {
            System.out.println("The element " + k + "is not in the list");
        }
    }
        return -1;
    }

    public static void main(String []args){

        //invoking the the sum method from the class A
        A obj = new A();
        double sum;
       sum = obj.sum(2,4);
        System.out.println("sum = "+sum);

/**************************************************************************************************************/
        //invoking the same method in the subClass
        inherSum objB = new inherSum();
                double inSum = objB.sum(7,8);
        System.out.println("The sum for the subclass is "+inSum);

 /*************************************************************************************************************/
        //invoking the overloaded methods
        System.out.println("\tPrinting the invoked overloaded methods");
        System.out.println(CodeFragments.methodA(9,49));
        System.out.println(CodeFragments.methodA(3.44,4.55));

 /***********************************************************************************************************/

    // Bubble sort
    int []sort = {3,5,2,6,7,9,10,2,12,3,5,20};

        int i, s, temp=0;

        for(i=0; i<sort.length; i++){
            for (s=i+1; s<=sort.length-1; s++){
                if(sort[i]<=sort[s]){
                    //swap
                    temp = sort[s];
                    sort[s] = sort[i];
                    sort[i] = temp;
                }
            }
        }
        //print the element in descending order
        System.out.println("Element in the descending order of magnitude");
        for(int j = 0; j<sort.length-1; j++)
        System.out.print(" "+sort[j]);


 /******************************************************************************************************/

        int[] arr = {2, 3, 4, 10, 40};
        int h = arr.length-1, l=0;
        int x = 10, mid= l+((h-l)/2);
        int res = CodeFragments.BiSearch(arr,mid,x);
        if(res==-1) System.out.println("Number not found");
         else System.out.println(res);

 /*****************************************************************************************************/
        byte b;
        //int i = 257;
        b = (byte)i;
        //System.out.println(b);

        int []a = {1,2};
        int []c = {3,4,5};
        //System.out.println(a==c);

        int []d = {1,3,4,5};
        d[1]=4;
        int []e =d;
        //System.out.println(Arrays.toString(e));

        }
    }
