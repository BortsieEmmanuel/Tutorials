package Basics;

public class Encapsulation {
    /*
    * The process of hiding your "sensitive" data from the reach of users or even other programs within
    * an application.
    * The process of making your data fields(attributes or variables) private to a particular class
    * and using getter methods to get or return the private attributes and setter methods to update
    * the declared variable or data fields in that class.
    *
    * To do this:
    * Make your class variables(attributes or data fields) private
    * use getter methods to access or return the value
    * use setter methods to update the class variable
    * */

    // These are variables within this class and are going to be accessed and update using getters and setters method.
    protected String name;
    private int Age;

    public Encapsulation(){ // this is a constructor and what it does is to give the default value anytime object of the class is invoked
        name = "Ama";
        Age = 32;
    }
    //getMethods
    public String getName(){
        return name;
    }

    public int getAge(){
        return Age;
    }

    //setMethods
    public void setAge(int newAge){
        Age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }


    public static void main(String[] args){
        Encapsulation use = new Encapsulation();
        //invoking or calling the default values
        System.out.println("These are the default variables inside the constructor\n"+use.getName());
        System.out.println(use.getAge()+"\n");

        //setting or updating the default values
        use.setName("Peacemaker");
        use.setAge(26);

        System.out.println("These are the updated values\n"+use.getName());
        System.out.println(use.getAge());

    }
}
