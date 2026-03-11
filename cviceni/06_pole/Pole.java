/**
 * Cvičení 06 – Pole
 * Ukázka práce s jednorozměrným a dvourozměrným polem.
 */
public class Pole {
    public static void main(String[] args) {
        // Jednorozměrné pole
        int[] cisla = {5, 3, 8, 1, 9, 2, 7, 4, 6};

        // Výpis pole
        System.out.print("Pole: ");
        for (int c : cisla) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Hledání maxima a minima
        int max = cisla[0];
        int min = cisla[0];
        for (int c : cisla) {
            if (c > max) max = c;
            if (c < min) min = c;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Dvourozměrné pole – násobilka 3x3
        int[][] nasobilka = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nasobilka[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Násobilka 3x3:");
        for (int[] radek : nasobilka) {
            for (int hodnota : radek) {
                System.out.printf("%3d", hodnota);
            }
            System.out.println();
        }
    }
}
