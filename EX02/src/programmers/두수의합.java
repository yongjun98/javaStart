package programmers;
//parameter : num1 num2
//return 타입 : int
public class 두수의합 {
    public static void main(String[] args) {
        int num1 =2;
        int num2 =3;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        int answer = -1;
                answer = num1+num2;
                return answer;
    }
}
