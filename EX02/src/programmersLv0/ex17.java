package programmersLv0;

public class ex17 {
    public static void main(String[] args) {
        int[] dot = {-7,9};

        System.out.println(solution(dot));
    }

    public static int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0) {          //1사분면
            answer=1;
        }else if(dot[0]<0 && dot[1]>0) {    //2사분면
            answer=2;
        }else if(dot[0]<0 && dot[1]<0) {    //3사분면
            answer=3;
        }else if(dot[0]>0 && dot[1]<0) {    //4사분면
            answer=4;
        }
        return answer;
    }
}
