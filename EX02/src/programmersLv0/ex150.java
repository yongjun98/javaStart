package programmersLv0;

import java.util.ArrayList;
import java.util.List;

public class ex150 {
    public static void main(String[] args) {
        String[]strArr = {"and","notad","abcd"};
        System.out.println(solution(strArr));
    }

    private static List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i< strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        return answer;
    }
}
