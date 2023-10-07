package programmersLv0;

public class ex81 {
    public static void main(String[] args) {
        int hp =23;
        System.out.println(solution(hp));
    }

    private static int solution(int hp) {
        int answer=hp/5;
        hp %= 5;

        answer+=hp/3;
        hp %= 3;

        answer+=hp/1;

        return answer;
    }
}
