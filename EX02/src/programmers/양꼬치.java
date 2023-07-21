package programmers;
//parameter : n,k
//return 타입 : int
public class 양꼬치 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        answer = n*12000 + 2000 *k;
        int min = (n/10) * 2000;
        int realAns = 0;
        realAns = answer-min;
        return realAns;
    }
}
