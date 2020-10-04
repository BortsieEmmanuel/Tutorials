package Basics;

public class ForEach {
    public static void main(String[] args) {

        int[] ages = {15, 20, 41, 50};
        //Iterate the array
        for (int age : ages) {
            System.out.println("Age :" + age);
        }
    }
}
