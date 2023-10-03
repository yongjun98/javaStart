package programmersLv0;

public class ex71 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        System.out.println(solution(n,t));
    }

    private static int solution(int n, int t) {
        for(int i=1; i<=t; i++){
            n *=2;
        }
        return n;
    }
}
