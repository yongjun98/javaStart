package ProegrammersLV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex77 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    private static int[] solution(String today, String[] terms, String[] privacies) {
        int cnt = intDay(today);

        String[] p1 = new String[privacies.length];
        int[] p2 = new int[privacies.length];
        int pLen = privacies.length;
        String tmp = "";

        for(int i=0; i<pLen; i++) {
            p1[i] = privacies[i].split(" ")[1];
            tmp = privacies[i].split(" ")[0];
            p2[i] = intDay(tmp);
        }


        String[] t1 = new String[terms.length];
        int[] t2 = new int[terms.length];
        int tLen = terms.length;

        for(int i=0; i<tLen; i++) {
            t1[i] = terms[i].split((" "))[0];
            tmp = terms[i].split(" ")[1];
            t2[i] = (Integer.parseInt(tmp)*28);
        }


        for(int i=0; i<tLen; i++) {
            for(int j=0; j<pLen; j++) {
                if(t1[i].equals(p1[j])) {
                    p2[j] += t2[i];
                }
            }
        }

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<pLen; i++) {
            if(p2[i]<cnt) {
                answer.add(i+1);
            }

        }

        int[] ans = new int[answer.size()];

        for(int i=0; i<answer.size(); i++) {
            ans[i] = answer.get(i);
        }

        return ans;
    }

    static int intDay(String str) {
        String tooday = str.replace(".", "");
        int year = Integer.parseInt(tooday.substring(2,4));
        int month = Integer.parseInt(tooday.substring(4,6));
        int day = Integer.parseInt(tooday.substring(6,8));
        return year*12*28 + month*28 + day;
    }
}
