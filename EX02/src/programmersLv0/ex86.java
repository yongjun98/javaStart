package programmersLv0;

public class ex86 {
    public static void main(String[] args) {
        String rsp = "2";
        System.out.println(solution(rsp));
    }

    private static String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            if(rsp.split("")[i].equals("0")){
                answer += "5";
            }
            else if(rsp.split("")[i].equals("2")){
                answer += "0";
            }
            else answer += "2";
        }
        return answer;
    }
}
