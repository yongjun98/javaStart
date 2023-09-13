package programmersLv0;

public class ex06 {
    public static void main(String[] args) {
        int age = 40;
        System.out.println(solution(age));
    }

    private static int solution(int age) {
        int answer =0;
        answer = 2023 -age;
        return answer;
    }
}
