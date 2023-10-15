package programmersLv0;

public class ex114 {
    public static void main(String[] args) {
        int [] box = {1,1,1};
        int n = 1;
        System.out.println(solution(box,n));
    }

    private static int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}
