package programmerslv1re;

public class ex33 {
    public static void main(String[] args) {
        int n =45;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String ans = "";
        while (n !=0){
            ans += n%3;
            n/=3;
        }
        return Integer.parseInt(ans,3);
    }
}
