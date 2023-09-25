package programmersLv0;

public class ex54 {
    public static void main(String[] args) {
        int [] num_list = {3,4,5,2,1};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int i = 0; i<num_list.length;i++){
            sum+=num_list[i];
            mul*=num_list[i];
        }
        if(sum * sum > mul){
            answer = 1;
        }
        return answer;
    }
}
