package programmers;
//parameter : n
//return 타입 : int


public class 피자나눠먹기1 {
    public static void main(String[] args) {
        int n =15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer =0;
        if(n%7 == 0)
            answer =n/7;
        else answer = n/7+1;
        return answer;
    }
}
