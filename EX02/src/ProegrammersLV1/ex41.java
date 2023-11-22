package ProegrammersLV1;

import java.util.ArrayList;
import java.util.List;

public class ex41 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t,p));
    }

    private static int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        List<String> chunk = new ArrayList<>();

        for (int i = 0; i <= tLength - pLength; i++) {
            chunk.add(t.substring(i, i + pLength));
        }

        for (String chunks : chunk){
            Long lChunks = Long.parseLong(chunks);
            Long lP = Long.parseLong(p);


            if (lChunks <= lP){
                answer++;
            }
        }

        return answer;
    }

}
