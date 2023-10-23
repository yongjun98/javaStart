package programmersLv0;

public class ex129 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(solution(my_string,m,c));
    }

    private static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        int startIndex = c - 1;
        while (startIndex < my_string.length()) {
            answer.append(my_string.charAt(startIndex));
            startIndex += m;
        }

        return answer.toString();
    }
}
