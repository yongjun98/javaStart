package programmersLv0;

public class ex95 {
    public static void main(String[] args) {
        int [] arr = {0,0,0,1};
        int idx = 1;
        System.out.println(solution(arr,idx));
    }

    private static int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
