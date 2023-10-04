package programmersLv0;

public class ex75 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        System.out.println(solution(my_string,alp));
    }

    private static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
