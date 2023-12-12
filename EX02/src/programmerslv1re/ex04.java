package programmerslv1re;

public class ex04 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
    }

    private static String solution(int num) {
        String answer = "";
        if(num%2 ==0)answer = "Even";
        else answer = "Odd";
        return answer;
    }
}
