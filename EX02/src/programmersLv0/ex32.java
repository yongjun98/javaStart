package programmersLv0;

public class ex32 {
    public static void main(String[] args) {
        int n =20;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer++;
            }
        }
        return answer;
    }
}
