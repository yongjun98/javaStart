package programmersLv0;

public class ex135 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string,indices));
    }

    private static String solution(String my_string, int[] indices) {
        String answer = "";

        // 1. my_string을 쉽게 접근할 수 있도록 문자열을 배열로
        String[] tmp = my_string.split("");

        //2. indices를 돌면서 지워야 할 값들을 비워둔다.
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        //3. 문자열을 하나로 합친다(빈 공간은 붙어도 어짜피 포함X, 단순 "")
        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }
}
