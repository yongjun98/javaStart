package ProegrammersLV1;

public class ex55 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[]section = {2,3,6};
        System.out.println(solution(n,m,section));
    }

    private static int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;

        for (int s : section) {
            if (s > index) {
                answer++;
                index = s + m - 1;
            }
        }

        return answer;
    }
}
