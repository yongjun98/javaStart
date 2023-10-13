package programmersLv0;

public class ex101 {
    public static void main(String[] args) {
        int num = 29183;
        int k =1;
        System.out.println(solution(num,k));
    }

    private static int solution(int num, int k) {
        int answer = 0;
        String[] s = String.valueOf(num).split("");
        for(int i=0; i<s.length; i++){
            if(s[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
            else{
                answer= -1;
            }
        }
        return answer;
    }
}
