package Tab;

public class tableau {
    public static int[][] genTab(int t[]) {
        int mat[][] = new int[t.length][];
        for (int i = 0; i < t.length; i++) {
            mat[i] = new int[t[i]];
        }
        return mat;
    }
}
