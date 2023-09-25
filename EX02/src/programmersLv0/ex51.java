package programmersLv0;

public class ex51 {
    public static void main(String[] args) {
        String myString ="aBcDeFg";
        System.out.println(solution(myString));
    }

    private static String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            answer += String.valueOf(myString.charAt(i)).toLowerCase();
        }

        return answer;
    }
}
