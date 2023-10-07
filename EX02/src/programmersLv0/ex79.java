package programmersLv0;

public class ex79 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer="";
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer+=String.valueOf(my_string.charAt(i)).toLowerCase();
            }else {
                answer+=String.valueOf(my_string.charAt(i)).toUpperCase();
            }
        }
        return answer;
    }
}
