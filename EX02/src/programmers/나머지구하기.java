package programmers;

public class 나머지구하기 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        int answer =0;
        answer = num1 %num2;
        return answer;
    }
}
