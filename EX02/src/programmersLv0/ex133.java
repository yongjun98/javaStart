package programmersLv0;

public class ex133 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(my_string,s,e));
    }

    private static String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s,e+1);


        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();


        my_string = my_string.replaceAll(answer, reversedStr);
        return my_string;
    }
}
