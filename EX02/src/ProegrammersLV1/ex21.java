package ProegrammersLV1;

public class ex21 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0) {
            answer = s.substring(length/2-1, length/2+1);
        } else {
            answer = s.substring(length/2, length/2+1);
        }
        return answer;
    }
}
