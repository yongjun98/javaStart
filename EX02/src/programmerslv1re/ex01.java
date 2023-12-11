package programmerslv1re;

public class ex01 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        answer=Integer.parseInt(s);
        return answer;
    }
}
