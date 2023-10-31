package programmersLv0;

import java.util.Arrays;

public class ex157 {
    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        System.out.println(Arrays.toString(solution(emergency)));
    }

    private static int[] solution(int[] emergency) {
        int[] asc = emergency.clone();
        int[] answer = new int[emergency.length];

        Arrays.sort(asc);

        for(int i=0; i<=emergency.length-1; i++) {
            for(int j=0; j<=emergency.length-1; j++) {
                if(asc[i]==emergency[j]) {
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}
