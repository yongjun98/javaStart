package programmersLv0;

public class ex10 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer =0;
        for(int i=2; i<=n; i++){
            if(i % 2 ==0) {
                answer += i;
            }
        }
        return answer;
    }
}
