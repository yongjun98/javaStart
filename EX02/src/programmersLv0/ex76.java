package programmersLv0;

public class ex76 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%2==1 && i%2==1){
                answer+=i;
            }
            else if(n%2==0 && i%2==0){
                answer+= i*i;
            }
        }
        return answer;
    }
}
