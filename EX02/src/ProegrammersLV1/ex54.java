package ProegrammersLV1;

public class ex54 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number,limit,power));
    }

    private static int solution(int number, int limit, int power) {
        int result = 0;
        int[] arr = new int[number+1];

        for(int i=1; i<=number; i++) {
            arr[i] = i;
            int n=0;

            for(int j=1; j*j <= arr[i]; j++) {
                if(j*j == arr[i]) {
                    n++;
                }
                else if(arr[i] % j  == 0) {
                    n +=2;
                }
                if(n > limit) {
                    n = power;
                    break;
                }
            }
            result += n;
        }
        return result;
    }
}
