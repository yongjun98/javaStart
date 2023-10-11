package programmersLv0;

public class ex96 {
    public static void main(String[] args) {
        int a = 9;
        int b =91;
        System.out.println(solution(a,b));
    }

    private static int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
    }
}
