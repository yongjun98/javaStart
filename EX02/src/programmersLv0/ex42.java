package programmersLv0;

public class ex42 {
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(solution(number,n,m));
    }

    private static int solution(int number, int n, int m) {
        int answer =0;
        if((number % n ==0)&&((number%m)==0)){
            return  1;
        }
        else{
            return  0;
        }
    }
}
