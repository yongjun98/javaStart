package ProegrammersLV1;

import java.util.Arrays;

public class ex33 {
    public static void main(String[] args) {
        int[]d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d,budget));
    }

    private static int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length; i++){
            if(total+d[i]<=budget) {
                total += d[i];
                answer++;
            }
        }
        return answer;
    }
}
