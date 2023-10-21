package programmersLv0;

public class ex116 {
    public static void main(String[] args) {
        int [] num_list = {12,4,15,1,14};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            while (num!= 1){
                if(num%2 == 0){
                    num/=2;
                }
                else{
                    num = (num-1)/2;
                }
                answer++;
            }
        }
        return answer;
    }
}
