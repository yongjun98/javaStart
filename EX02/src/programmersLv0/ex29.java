package programmersLv0;

public class ex29 {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        for(int i= 0; i<a.length(); i++){
            answer +=Integer.parseInt(a.substring(i,i+1));
        }
        return answer;
    }
}
