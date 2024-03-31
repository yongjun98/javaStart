package CodingTest.day2;

public class ex05 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        System.out.println(solution(my_string,overwrite_string,s));
    }

    private static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String str = my_string.substring((s+overwrite_string.length()),my_string.length());
        answer = my_string.substring(0,s) + overwrite_string + str;
        return answer;
    }
}
