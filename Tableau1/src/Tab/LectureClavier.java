package Tab;

import java.util.Scanner;

public class LectureClavier {
    public static int lireInt() {
        int i;
        Scanner si = new Scanner(System.in);
        i = si.nextInt();
        return i;
    }

    // Méthode pour la lecture d'un double
    public static double lireDbl() {
        double d;
        Scanner sd = new Scanner(System.in);
        d = sd.nextDouble();

        return d;
    }

    // Méthode pour la lecture d'une chaine de caractéres
    public static String lireStr() {
        String s;
        Scanner ss = new Scanner(System.in);
        s = ss.nextLine();

        return s;

    }

    // Méthode pour la lecture d'un caractére
    public static char lireChar() {
        char c;

        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        return c;
    }
}