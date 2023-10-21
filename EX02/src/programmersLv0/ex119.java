package programmersLv0;

import java.util.Arrays;

public class ex119 {
    public static void main(String[] args) {
        int n =3;
        System.out.println(Arrays.deepToString(soluton(n)));
    }

    private static int[][] soluton(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }

        return answer;
    }
}
