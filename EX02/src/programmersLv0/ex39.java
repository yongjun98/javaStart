package programmersLv0;

import java.util.Arrays;

public class ex39 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int [] answer = {};
        int j=0;
        if(n%2 ==0){
            answer = new int[n/2];
        }
        else{
            answer = new int[(n+1)/2];
        }

        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                answer[j] =i;
                j++;
            }
        }
        return answer;
    }
}
