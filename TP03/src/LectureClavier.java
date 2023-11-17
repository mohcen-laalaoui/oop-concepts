import java.util.Scanner;

public class LectureClavier {
    public static int lireInt() {
        int i;
        Scanner si = new Scanner(System.in);
        i = si.nextInt();
        return i;
    }

    public class bibliotab {
        public static int sommeTab(int a[]) {
            int s = 0;

            for (int i = 0; i < a.length; i++)
                s += a[i];

            return s;
        }

        public static double sommeTab(double a[]) {
            double s = 0;

            for (int i = 0; i < a.length; i++)
                s += a[i];

            return s;
        }

        public static void afficherT2T(int a[][]) {

            for (int i = 0; i < a.length; i++) {
                System.out.println(" ");
                for (int j = 0; j < a[i].length; j++)
                    System.out.print(" " + a[i][j]);
            }

        }

        public static double[] somdeuxTab(double[] a, double b[]) {

            double tr[] = new double[a.length];

            if (a.length == b.length)
                for (int i = 0; i < a.length; i++)
                    tr[i] = a[i] + b[i];
            else
                System.out.println("Pas possible ! ");
            return tr;
        }

        public static int[] somdeuxTab(int[] a, int b[]) {

            int tr[] = new int[a.length];

            if (a.length == b.length)
                for (int i = 0; i < a.length; i++)
                    tr[i] = a[i] + b[i];
            else
                System.out.println("Pas possible ! ");
            return tr;
        }

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
}