package programmersLv0;

public class ex99 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    private static String solution(int age) {
        String answer = "";
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");

        for(int i = 0; i< ageArr.length; i++){
            answer += age962.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}
