package programmersLv0;

import java.util.Arrays;

public class ex70 {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;
        System.out.println(solution(a,b));
    }

    private static int solution(int a, int b) {
        int answer = 0;
        if(a % 2 ==1 && b % 2 == 1){
            answer = a*a+b*b;
        }
        else if((a%2)+(b%2) ==1){
            answer = 2*(a+b);
        }
        else{
            answer = Math.abs(a-b);
        }
        return answer;
    }
}
