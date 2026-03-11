/**
 * Cvičení 03 – Podmínky
 * Ukázka podmíněného větvení: if/else a switch.
 */
public class Podminky {
    public static void main(String[] args) {
        int znamka = 2;

        // if / else if / else
        if (znamka == 1) {
            System.out.println("Výborně");
        } else if (znamka == 2) {
            System.out.println("Chvalitebně");
        } else if (znamka == 3) {
            System.out.println("Dobře");
        } else if (znamka == 4) {
            System.out.println("Dostatečně");
        } else {
            System.out.println("Nedostatečně");
        }

        // switch
        int den = 3;
        switch (den) {
            case 1:
                System.out.println("Pondělí");
                break;
            case 2:
                System.out.println("Úterý");
                break;
            case 3:
                System.out.println("Středa");
                break;
            default:
                System.out.println("Jiný den");
        }
    }
}
