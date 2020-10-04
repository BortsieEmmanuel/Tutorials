package com.oop.patrick;

import java.util.Arrays;

public class ChkRes {
    public int ArrInMem(int a, int b,int c){
        return 1;
    }

    public static boolean Y(int yr){
        if(yr%4 ==0 && yr%400==0)
            return true;
        else if (yr%100 !=0)
            return false;
        else
            return false;
    }
    public static void main(String[] args){

        System.out.println(Y(101));

        int []a = new int[1];
        a[0] = 12;
        int []b = a;
        b[0] = 5000;
        System.out.println(a[0]);

        int x = Integer.MAX_VALUE;

        System.out.println("The value of x is : "+x);
        System.out.println("--------------------------------------------------------------------");

    int arr[] = {3,5,6,8,9,12,4,7};
    int var = 12;
    int i = arr[0];
    int j = arr.length;

    int res = DataSearch.biSearch(arr,var,i,j);
        System.out.println("the value of "+var +" is found at index :"+res);

        System.out.println("..........................................................................");

        Person person = new Student();
        person.talk();
        System.out.println();

        System.out.println("--------------------------------------------------------------------");

    }

    public static class Person{
        String name = "Kofi";
        int age;
        public void talk(){
            System.out.println("I am a person");
        }
    }

    public static class Student extends Person{
        String name;
        int age;
        public void talk(){
            System.out.println("I am a student");
            System.out.println("--------------------------------------------------------------------");
        }

    }



}