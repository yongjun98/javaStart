package programmers;
//parameter : my_string , letter
//return type : String
public class 특정문자제거하기 {
    public static void main(String[] args) {
       String my_string = "abcdef";
       String letter = "c";
        System.out.println(solution(my_string,letter));
    }

    private static String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}
