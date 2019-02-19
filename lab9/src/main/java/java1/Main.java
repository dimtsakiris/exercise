package java1;

public class Main {

    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] intP = new int[m][n];
        int[] theseisLine = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                intP[i][j] = (int) (Math.random() * 10);
            }
        }
        displayP(intP, m, n);
        findMinCol(intP, theseisLine, m, n);
        for (int k = 0; k < theseisLine.length; k++) {
            System.out.println(theseisLine[k]);
        }
    }

    private static void displayP(int[][] intP, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(intP[i][j]);
            }
            System.out.println();
        }
    }

    private static void findMinCol(int[][] intP, int[] theseisLine, int m, int n) {
        for (int j = 0; j < n; j++) {
            theseisLine[j] = intP[0][j];
            for (int i = 1; i < m ; i++) {
                if (theseisLine[j] > intP[i][j]) {
                    theseisLine[j] = intP[i][j];
                }
            }
        }
    }

}

