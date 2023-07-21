package programmers;
//parameter = n
// return 타입 : int

// 다시 한번 풀어볼 것 !
public class 짝수의합 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer =0;
        for(int i=2; i<=n; i+=2){
            answer+=i;
        }
        return answer;
    }
}
