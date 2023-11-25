package ProegrammersLV1;

public class ex46 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        System.out.println(solution(a,b,n));
    }

    private static int solution(int a, int b, int n) {
        int answer = 0;
        while (true){
            if(n<a){
                break;
            }
            answer+=(n/a)*b;
            n = ((n/a)*b)+(n%a);
        }
        return answer;
    }
}
