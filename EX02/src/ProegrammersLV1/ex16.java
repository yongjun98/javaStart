package ProegrammersLV1;

public class ex16 {
    public static void main(String[] args) {
        String[]seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    private static String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}
