package programmersLv0;

public class ex52 {
    public static void main(String[] args) {
        int [] num_list = {3,4,5,2,1};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        String a = "";
        String b = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a += Integer.toString(num_list[i]);
            }else{
                b += Integer.toString(num_list[i]);
            }
        }
        int aSum = Integer.parseInt(a);
        int bSum = Integer.parseInt(b);

        return aSum + bSum;
    }
}
