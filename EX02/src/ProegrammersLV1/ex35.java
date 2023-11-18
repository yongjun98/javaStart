package ProegrammersLV1;

public class ex35 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        String []str = s.split("");

        int idx = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                idx = 0;
            }
            else if(idx%2 == 0){
                str[i] = str[i].toUpperCase();
                idx++;
            }
            else if(idx%2 != 0){
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }
}
