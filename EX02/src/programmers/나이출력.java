package programmers;

//parameter : age
//return 타입 : int
public class 나이출력 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    private static int solution(int age) {
        int answer =0;
        answer = 2023 -age;

        return answer;
    }
}
