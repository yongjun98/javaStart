package programmersLv0;

public class ex13 {
    public static void main(String[] args) {
    String message = "happy birthday";
        System.out.println(solution(message));
    }

    private static int solution(String message) {
        int answer = 0;
        answer = message.length()*2;
        return answer;
    }
}
