package programmerslv1re;

public class ex08 {
    public static void main(String[] args) {
        int N = 123;
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        int answer = 0;
        String[]arr = String.valueOf(N).split("");

        for(String a : arr){
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}
