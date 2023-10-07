package programmersLv0;

public class ex78 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        System.out.println(solution(my_string,is_suffix));
    }

    private static int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)){
            answer = 1;
        }
        return answer;
    }
}
