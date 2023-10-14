package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex107 {
    public static void main(String[] args) {
        String[]strARR = {"and","notad","abcd"};
        System.out.println(solution(strARR));
    }

    private static List<String> solution(String[] strARR) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<strARR.length; i++){
            if(!strARR[i].contains("ad")){
                answer.add(strARR[i]);
            }
        }
        return answer;
    }
}
