package ProegrammersLV1;

public class ex22 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static String  solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(i%2 == 0) {
                answer += "수";
            }
            if(i%2 == 1) {
                answer += "박";
            }
        }
        return answer;
    }
}
