import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);
        boolean kör = true;

        System.out.println("Välkommen till Kalkylatorn!");

        while (kör) {
            // Meny
            System.out.println("\nVälj räknesätt:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraktion (-)");
            System.out.println("3. Multiplikation (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Avsluta");
            System.out.print("Ditt val: ");
            int val = tangentbord.nextInt();

            if (val == 5) {
                System.out.println("Avslutar kalkylatorn..");
                break;
            }

            // Läs in två tal
            System.out.print("Ange första talet: ");
            double tal1 = tangentbord.nextDouble();
            System.out.print("Ange andra talet: ");
            double tal2 = tangentbord.nextDouble();

            double resultat = 0;

            switch (val) {
                case 1:
                    resultat = addition(tal1, tal2);
                    System.out.println("Resultat: " + tal1 + " + " + tal2 + " = " + resultat);
                    break;
                case 2:
                    resultat = subtraktion(tal1, tal2);
                    System.out.println("Resultat: " + tal1 + " - " + tal2 + " = " + resultat);
                    break;
                case 3:
                    resultat = multiplikation(tal1, tal2);
                    System.out.println("Resultat: " + tal1 + " * " + tal2 + " = " + resultat);
                    break;
                case 4:
                    if (tal2 != 0) {
                        resultat = division(tal1, tal2);
                        System.out.println("Resultat: " + tal1 + " / " + tal2 + " = " + resultat);
                    } else {
                        System.out.println("Fel: Division med 0 är inte tillåtet!");
                    }
                    break;
                default:
                    System.out.println("Ogiltigt val! Försök igen.");
            }
        }

        tangentbord.close();
    }

    // Metoder för de olika räknesätten
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraktion(double a, double b) {
        return a - b;
    }

    public static double multiplikation(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}
