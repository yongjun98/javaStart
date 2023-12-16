package programmerslv1re;

public class ex10 {
    public static void main(String[] args) {
        int n =121;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;

        while(answer * answer < n){
            answer++;
        }

        if(answer * answer == n){
            answer++;
            answer*=answer;
        }else{
            answer = -1;
        }
        return answer;
    }
}
