package ProegrammersLV1;

public class ex01 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        String answer = "";
        if(n%2 ==0)answer = "Even";
        else answer = "Odd";
        return answer;
    }
}
