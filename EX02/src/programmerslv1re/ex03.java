package programmerslv1re;

public class ex03 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i = 2; i<n; i++){
            if(n%i ==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
