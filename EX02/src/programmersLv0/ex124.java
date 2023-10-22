package programmersLv0;

public class ex124 {
    public static void main(String[] args) {
        String [] arr = {"a","b","c"};
        System.out.println(solution(arr));
    }

    private static String solution(String[] arr) {
        String answer = String.join("", arr);
        return answer;
    }
}
