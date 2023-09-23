package programmersLv0;

public class ex40 {
    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i*i == n){
                answer= 1;
                break;
            }
            else{
                answer= 2;
            }
        }
        return answer;
    }
}
