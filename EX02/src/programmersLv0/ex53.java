package programmersLv0;

public class ex53 {
    public static void main(String[] args) {
        String my_string = "string";
        int k =3;
        System.out.println(solution(my_string,k));
    }

    private static String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i<k; i++){
            answer+=my_string;
        }
        return answer;
    }
}
