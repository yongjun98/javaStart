package programmersLv0;

public class ex127 {
    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));
    }

    private static int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        for (int i = 0; i < strOrder.length(); i++) {
            char tempChar = strOrder.charAt(i);

            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}
