package com.oop.patrick;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
public class Student {
    String option;
    String gender;
    int id;

    public double calculateTGP(double[] TGP) {
        double sum = 0;
        try {
            for (int i = 0; i <= TGP.length - 1; i++) {
                sum += TGP[i];
            }
        }catch (ArithmeticException e){
            System.out.println("Arithematic Error in calculateTGP of class Student "+e);
        }
        return sum;
    }

    public double calculateGPA(double TGP, double TCU) {
        double average = 0.0;
        try {
             average = TGP / TCU;
        } catch (ArithmeticException e) {
            System.out.println("Division Error"+e);
        }
        return average;
    }
    public double calculateTCU(double[] TCU) {
        double sum = 0;
        try {
            sum = 0;
            for (int i = 0; i <= TCU.length - 1; i++) {
                sum += TCU[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Expression Error " + e);
        }catch (IndexOutOfBoundsException e){

            System.out.println("CHECK your array size"+e);
        }
        return sum;
    }
}


