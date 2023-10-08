package programmersLv0;

public class ex82 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";
        System.out.println(solution(my_string,is_prefix));
    }

    private static int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }
}
