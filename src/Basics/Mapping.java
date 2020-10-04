package Basics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mapping {

public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    Map map = new HashMap();
    System.out.println("Getting Student and their ID NUMBER ");
    for(int i=1; i<=2; i++) {
        System.out.print("Please enter name : ");
        String key = userInput.next();

        System.out.print("ID NUMBER? : ");
        String ValueKey = userInput.next();
        map.put(key, ValueKey);
    }
    System.out.println(map.toString());
}
}
