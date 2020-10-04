package Basics;

public class Inheritance  extends Encapsulation{
    public static void main(String args[]){

        Inheritance inher = new Inheritance();
        String Name = inher.name;
        inher.setName("New class name from the encapsulation");
        System.out.println(inher.getName());

    }
}
