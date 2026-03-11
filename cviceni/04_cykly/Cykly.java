/**
 * Cvičení 04 – Cykly
 * Ukázka cyklů: for, while a do-while.
 */
public class Cykly {
    public static void main(String[] args) {
        // for cyklus – výpis čísel 1 až 5
        System.out.println("For cyklus:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while cyklus – odpočítávání
        System.out.println("While cyklus:");
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n--;
        }

        // do-while cyklus
        System.out.println("Do-while cyklus:");
        int x = 1;
        do {
            System.out.println("x = " + x);
            x *= 2;
        } while (x <= 8);
    }
}
