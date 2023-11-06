package ProegrammersLV1;

public class ex08 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String[]arr = String.valueOf(n).split("");

        for(String a : arr){
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}
