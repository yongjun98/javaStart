package programmersLv0;

public class ex03 {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =5;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        int answer =0;
        answer = num1 / num2;
        return answer;
    }
}
