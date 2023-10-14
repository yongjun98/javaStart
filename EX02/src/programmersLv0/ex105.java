package programmersLv0;

public class ex105 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        System.out.println(solution(a,b));
    }
    private static int solution(int a, int b) {
        String a_b_str = Integer.toString(a)+Integer.toString(b);
        int a_b = Integer.valueOf(a_b_str);

        if(a_b >= 2*a*b){
            return a_b;
        }
        else{
            return 2*a*b;
        }
    }
}
