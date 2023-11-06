package ProegrammersLV1;

public class ex09 {
    public static void main(String[] args) {
        long n =121;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }
}
