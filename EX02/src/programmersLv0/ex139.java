package programmersLv0;

import java.util.ArrayList;
import java.util.List;

public class ex139 {
    public static void main(String[] args) {
        int[]num_list = {2,1,6};
        int n =3;
        System.out.println(solution(num_list,n));
    }

    private static List solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = n-1; i<num_list.length;i++){
            answer.add(num_list[i]);
        }
        return answer;
    }
}
