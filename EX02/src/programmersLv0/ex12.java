package programmersLv0;

public class ex12 {
    public static void main(String[] args) {
        int n = 64;
        int k = 6;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        answer = n*12000 + k*2000;
        int svc = (n/10)*2000;
        int realAns = answer-svc;
        return realAns;
    }
}
