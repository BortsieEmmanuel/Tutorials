package Exercises;

public class EulersXpression {

    public static void main(String[] args){
        double factorial = 1.0;
        double n = 1.0;
        double term ;

        for (term = 1.0; term>=0000001; term++){
            n++;
            term =term/n;
            factorial = factorial + term;

            getch();
        }
    }

    private static void getch() {

    }

    public static Object getCh() {
        Object ch = null;
        return ch;
    }

    public static void setCh(Object ch) {
        ch = ch;
    }
}
