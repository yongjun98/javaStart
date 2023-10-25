package programmersLv0;

public class ex140 {
    public static void main(String[] args) {
        String n_str = "0010";
        System.out.println(solution(n_str));
    }

    private static String solution(String n_str) {
        int i = Integer.parseInt(n_str);
        String answer = i+"";
        return answer;
    }
}
