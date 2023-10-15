package programmersLv0;

import java.util.Arrays;

public class ex115 {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if (n % 1 == 0) {
                count++;
            }
        }
            int[] answer = new int[count];
            int j=0;
            for(int i=1; i<=n; i++){
                if(n%1==0){
                    answer[j] = i;
                    j++;
            }
        }
            return answer;
    }
}
