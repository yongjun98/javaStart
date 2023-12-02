package ProegrammersLV1;

public class ex70 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;

        char x = 0;
        int left = 0, right = 0;

        for(int i=0 ; i < s.length();i++) {
            if(x == 0) {
                x = s.charAt(i);
            }
            if (x != s.charAt(i)) {
                right++;
            } else {
                left++;
            }
            if(left == right) {
                x = 0;
                left = 0;
                right = 0;
                answer++;
            }
        }
        if(x != 0) answer++;
        return answer;
    }
}
