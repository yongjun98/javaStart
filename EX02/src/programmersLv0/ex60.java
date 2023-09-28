package programmersLv0;
/*길이에 따른 연산*/
public class ex60 {
    public static void main(String[] args) {
        int [] num_list = {3,4,5,2,5,4,6,7,3,7,2,2,1};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        int answer = 0;
        for(int i = 0; i<num_list.length;i++){
            if(num_list.length>=11){
                sum+=num_list[i];
                answer = sum;
            }
            else {
                mul*=num_list[i];
                answer = mul;
            }
        }
        return answer;
    }
}
