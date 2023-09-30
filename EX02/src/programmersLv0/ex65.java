package programmersLv0;

public class ex65 {
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";
        System.out.println(solution(my_string,target));
    }

    private static int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){
            answer = 1;
        }
        return answer;
    }
}
