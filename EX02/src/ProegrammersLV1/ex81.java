package ProegrammersLV1;

import java.util.Arrays;

public class ex81 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[]terms = {"A 6", "B 12", "C 3"};
        String[]privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    private static int[] solution(String today, String[] terms, String[] privacies) {
        String today2 = today.replace(".","");
        int year = Integer.parseInt(today2.substring(0,4));
        int month = Integer.parseInt(today2.substring(4,6));
        int day = Integer.parseInt(today2.substring(6,8));
        int cnt = (year*12*28) + (month*28) + day;
        int[]answer = new int[privacies.length];

        for(int i =0; i<privacies.length; i++){
            String[] pSplit = privacies[i].split(" ");
            int num = 0;
            for(int j=0; j<terms.length; j++){
                String[] tSplit = terms[j].split(" ");
                if(pSplit[1].equals(tSplit[0])){
                    num = Integer.parseInt(tSplit[1]);
                    break;
                }
            }
            String[] pSplitDate = pSplit[0].split("\\.");

            int pyear = Integer.parseInt(pSplitDate[0]);
            int pmonth = Integer.parseInt(pSplitDate[1]);
            int pday = Integer.parseInt(pSplitDate[2]);

            pmonth += num;

            int tcnt = (pyear*12*28) + (pmonth*28) + pday-1;

            if(cnt>tcnt){
                answer[i] = i+1;
            }
        }
        int a = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]>0){
                a++;
            }
        }
        int[]arr = new int[a];
        int idx = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]>0){
                arr[idx] = answer[i];
                idx++;
            }
        }
        return arr;
    }
}
