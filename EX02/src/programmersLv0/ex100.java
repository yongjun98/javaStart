package programmersLv0;

public class ex100 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=6*n; i++){
            if(6*i%n ==0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
