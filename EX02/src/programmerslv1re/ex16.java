package programmerslv1re;

public class ex16 {
    public static void main(String[] args) {
        int n =6;
        System.out.println(solution(n));
    }

    private static int solution(long n) {
        int answer = 0;

        while(n != 1) {
            if(n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
            answer++;

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
