package programmersLv0;

public class ex49 {
    public static void main(String[] args) {
        int num = 98;
        int n =2;
        System.out.println(solution(num,n));
    }

    private static int solution(int num, int n) {
        if(num%n == 0){
            return  1;
        }
        else{
            return  0;
        }
    }
}
