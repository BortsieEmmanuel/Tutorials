package com.oop.patrick;
import  java.util.Scanner;
public class Students {
    public String ID;
    public String Java;
    public String   cpp;


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setJava(String java) {
        Java = java;
    }

    public void setCpp(String cpp) {
        this.cpp = cpp;
    }

    public String getID(){
        return String.valueOf(ID);
    }

    public String getJava() {
        return Java;
    }

    public String getCpp() {
        return cpp;
    }

    public String Result(){

        Scanner input = new Scanner(System.in);
        String A[][] =  new String[3][5];
        int nr = A[0].length;


    for(int i = 0; i<2; i++ ){
        for (int j=0; j<=2; j++){
            System.out.println("Enter ID");
            String id = input.next();
            setID(id);
            A[i][j] = getID();

            System.out.println("Enter Java");
            String jar = input.next();
            setJava(jar);
            A[i][j] = getJava();

            System.out.println("Enter cpp");
            String cpp = input.next();
            setCpp(cpp);
            A[i][j] = getCpp();

        }
    }
    return Result();
    }
}
