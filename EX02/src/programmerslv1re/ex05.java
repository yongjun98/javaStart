package programmerslv1re;

public class ex05 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer+n;
    }
}
