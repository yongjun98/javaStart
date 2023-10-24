package programmersLv0;

public class ex132 {
    public static void main(String[] args) {
        boolean x1 = true;
        boolean x2 = false;
        boolean x3 = false;
        boolean x4 = false;
        System.out.println(solution(x1,x2,x3,x4));
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);

        return answer;
    }
}
