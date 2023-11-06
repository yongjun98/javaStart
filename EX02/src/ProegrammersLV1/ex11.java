package ProegrammersLV1;

public class ex11 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p') p++;
            else if(s.charAt(i) == 'y') y++;
        }

        if(p != y) answer = false;

        return answer;
    }
}
