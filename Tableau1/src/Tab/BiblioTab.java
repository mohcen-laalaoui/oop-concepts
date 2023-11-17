package Tab;

public class BiblioTab {

    /*
     * BiblioTab est une classe qui ne contient pas des attributs, et qui sert comme
     * une bibliothéque de méthodes pour la manipulation des tableaux
     * elle contient uniquement des méthodes statiques
     */

    // Méthode pour le clacul la somme des éléments d'un tableau des entiers
    public static int sommeTab(int a[]) {
        int s = 0;

        for (int i = 0; i < a.length; i++)
            s += a[i];

        return s;
    }

    // Méthode pour le clacul la somme des éléments d'un tableau des doubles

    public static double sommeTab(double a[]) {
        double s = 0;

        for (int i = 0; i < a.length; i++)
            s += a[i];

        return s;
    }

    // M�thode pour l'affichage des �l�ments d'un tableau bidimentionnel
    public static void afficherT2T(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < a[i].length; j++)
                System.out.print(" " + a[i][j]);
        }

    }

    // M�thode pour le clacul la somme des �l�ments de deux tableaux double en un
    // troisi�me tableau qui sera retourn� par la m�thode
    public static double[] somdeuxTab(double[] a, double b[]) {

        double tr[] = new double[a.length];

        if (a.length == b.length)
            for (int i = 0; i < a.length; i++)
                tr[i] = a[i] + b[i];
        else
            System.out.println("Pas possible ! ");

        return tr;
    }

    // M�thode pour le clacul la somme des �l�ments de deux tableaux entiers en un
    // troisi�me
    public static int[] somdeuxTab(int[] a, int b[]) {

        int tr[] = new int[a.length];

        if (a.length == b.length)
            for (int i = 0; i < a.length; i++)
                tr[i] = a[i] + b[i];
        else
            System.out.println("Pas possible ! ");

        return tr;

    }

    // Méthode pour la vérification si deux tableaux de char sont égaux (char par
    // char)
    public static boolean checkEgality(char[] t1, char[] t2) {

        boolean eg = true;
        int i = 0;

        if (t1.length == t2.length)
            while ((i < t1.length) && (eg)) {
                if (t1[i] != t2[i])
                    eg = false;

                i++;
            }
        else
            System.out.println("Les deux tableaux ne sont pas de meme taile ! ");

        return eg;
    }

    // M�thode pour la v�rification si un tableau de char est palindrome (laval est
    // un mot palindrome)
    public static boolean checkPalin(char t[]) {

        int pi, pf;
        pi = 0;
        pf = t.length - 1;
        boolean pl = true;

        while ((pl) && (pi < pf))
            if (t[pi] != t[pf])
                pl = false;
            else {
                pi++;
                pf--;
            }

        return pl;

    }
}
