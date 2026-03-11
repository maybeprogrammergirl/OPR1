/**
 * Cvičení 05 – Metody
 * Ukázka definice a volání metod.
 */
public class Metody {

    /** Vrátí součet dvou celých čísel. */
    static int sectej(int a, int b) {
        return a + b;
    }

    /** Vrátí faktoriál čísla n (n >= 0). */
    static long faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    /** Zkontroluje, zda je číslo sudé. */
    static boolean jeSude(int cislo) {
        return cislo % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Součet 3 + 7 = " + sectej(3, 7));
        System.out.println("5! = " + faktorial(5));
        System.out.println("Je 4 sudé? " + jeSude(4));
        System.out.println("Je 7 sudé? " + jeSude(7));
    }
}
