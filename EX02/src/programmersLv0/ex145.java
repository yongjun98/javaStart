package programmersLv0;

public class ex145 {
    public static void main(String[] args) {
        String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][]parts = {{0,4},{1,2},{3,5},{7,7}};
        System.out.println(solution(my_string,parts));
    }

    private static String solution(String[] my_string, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_string.length; i++){
            String str = my_string[i];

            answer += str.substring(parts[i][0], parts[i][1]+1);
        }

        return answer;
    }
}
