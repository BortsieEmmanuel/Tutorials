package com.oop.patrick;
                                /**Student GPA class
                                 * Author: AMANKWAH  DANIEL
                                 * index number : UE20030717
                                 *
                                 * **/
import java.util.Scanner;

public class StudentGPA {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's name: ");
        String name = in.next();

        System.out.println("Enter Student's ID: ");
        int id = in.nextInt();

        System.out.println("Enter Student's program options :");
        String opt = in.next();

        Student obj = new Student();
        System.out.println("Enter number of courses: ");
        int numC = in.nextInt();

        double tgpVal, tcuVal, totalTGP, totalTCU;
        double []TGP = new double[numC];//use array to accept the TGPs

        for(int i=0; i<=TGP.length-1; i++){
            System.out.println("Enter GP for "+(i+1));
            tgpVal = in.nextDouble();
            TGP[i] = tgpVal;// store TGP values in arrayTGP
        }
        totalTGP = obj.calculateTGP(TGP);//call method to calculate the actual TGP
        System.out.println("The Total TGP of Student is : "+totalTGP);

        double[]TCU = new double[numC];
        for (int i=0; i<=TCU.length-1; i++){
            System.out.println("Enter CU for course " +(i+1));
            tcuVal = in.nextDouble();
            TCU[i] = tcuVal; //store TGP values
        }
        totalTCU  = obj.calculateTCU(TCU);//call method to calculate actual TCU
        System.out.println("The Total TCU of the Student is: "+totalTCU);

        //calculate GPA
        System.out.println("The GPA of student "+" "+name+" "+"with id"+" "+id+
                " "+" offering"+" "+opt+" "+"has GPA"+
                " "+obj.calculateGPA(totalTGP,totalTCU));
    }
}
