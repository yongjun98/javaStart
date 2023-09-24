package programmersLv0;

public class ex46 {
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag =false;
        System.out.println(solution(a,b,flag));
    }

    private static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a+b;
        }
        else{
            answer = a-b;
        }
        return answer;
    }
}
