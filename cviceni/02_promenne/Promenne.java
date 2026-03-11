/**
 * Cvičení 02 – Proměnné a datové typy
 * Ukázka základních datových typů v Javě.
 */
public class Promenne {
    public static void main(String[] args) {
        // Celá čísla
        int vek = 20;
        long velkeCislo = 1_000_000_000L;

        // Desetinná čísla
        double pi = 3.14159;
        float teplota = 36.6f;

        // Znaky a řetězce
        char pismeno = 'A';
        String jmeno = "Jana";

        // Logická hodnota
        boolean jeStudent = true;

        System.out.println("Jméno: " + jmeno);
        System.out.println("Věk: " + vek);
        System.out.println("Pi: " + pi);
        System.out.println("Je student: " + jeStudent);
        System.out.println("Písmeno: " + pismeno);
    }
}
