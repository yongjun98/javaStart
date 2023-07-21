package programmers;
//parameter : numbers
//return 타입 : int[]
public class 배열의평균값 {
    public static void main(String[] args) {
        int[]numbers ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(numbers));
    }

    private static double solution(int[] numbers) {
        double sum =0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        double answer = sum / numbers.length;
        return answer;
    }
}
