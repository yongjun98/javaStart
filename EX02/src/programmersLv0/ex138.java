package programmersLv0;

public class ex138 {
    public static void main(String[] args) {
        String rny_string = "masterpiece";
        System.out.println(solution(rny_string));
    }

    private static String solution(String rny_string) {
        String answer = rny_string.replaceAll("m","rn");
        return answer;
    }
}
