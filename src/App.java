import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Räknar ut 4+5");
        int svar = plus(4,5);
        System.out.println("blir "+svar);
    }


    public static int plus(int tal1, int tal2)
    {
        int summa = tal1*tal2;
        return summa;

    }
}
