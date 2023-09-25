package programmersLv0;

public class ex55 {
    public static void main(String[] args) {
        String num_str = "123456789";
        System.out.println(solution(num_str));
    }

    private static int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            int a = Integer.parseInt(num_str.substring(i, i+1));

            answer += a;
        }

        return answer;
    }
}
