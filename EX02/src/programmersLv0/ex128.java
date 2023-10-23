package programmersLv0;

public class ex128 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
        System.out.println(solution(a,b,c));
    }

    private static int solution(int a, int b, int c) {
        int answer = 0;

        if(a==b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a==b&&b!=c||a==c&&c!=b||a!=b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else{
            answer = a+b+c;
        }

        return answer;
    }
}
