package Basics;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleIntegerProperty;
/**
* An entity that wraps contents and allows to observe the content for invalidation
*@author: Kwesi-Welbred
* @version: 1.0
*
* */

public class javaObservable {
    public  static void main(String[] args){

        nonObserve();
        observe();
    }

    private static void observe() {
        System.out.println("The Observable approach".toUpperCase());

        SimpleIntegerProperty a = new SimpleIntegerProperty(5);
        SimpleIntegerProperty b = new SimpleIntegerProperty(4);
        SimpleIntegerProperty c = new SimpleIntegerProperty(5);
        NumberBinding sum = a.multiply(b).divide(c);

        a.set(20);// this enables you to update the value of the variables anywhere in the block
        b.set(80);
        System.out.println(sum.getValue());

    }
    /**The non observable Approach.
     * here the value of 'a' still remains unchanged, thus, it still uses the first initialized value 'a = 20'
     * To solve this, you need to use the observable class
     * @param: null
     * @version: 0.1
     * **/
    private static void nonObserve() {
        System.out.println("The nonObservable approach\n".toUpperCase());
        int a = 20;
        int b = 49;
        int sum = a +b;
        System.out.println("When 'a' is not altered\n"+"The sum is: " +sum);// sum = 69

        a = 30;
        System.out.println("When 'a' is altered\n"+"The sum is: "+sum);// still the sum = 69
    }

}
