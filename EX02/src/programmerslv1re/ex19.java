package programmerslv1re;

public class ex19 {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int sum =0;
        int total = 0;
        for(int i = 0; i<10; i++) {
            sum+=i;
        }

        for(int i = 0; i<numbers.length; i++) {
            total += numbers[i];
        }
        answer = sum - total;


        return answer;
    }
}
