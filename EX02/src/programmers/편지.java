package programmers;
//parameter : message
//return type : int
public class 편지 {
    public static void main(String[] args) {
        String message = "happy birthday!";
        System.out.println(solution(message));
    }

    private static int solution(String message) {
        int answer =0;
        answer = message.length()*2;
        return answer;
    }
}
