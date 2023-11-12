package ProegrammersLV1;

public class ex25 {
    public static void main(String[] args) {
        int price = 3;
        int money =20;
        int count =4;
        System.out.println(solution(price,money,count));
    }

    private static long solution(int price, int money, int count) {
        long temp = 0;
        for(int i = 1; i <= count; i++)
        {
            temp += i * price;
        }

        if (temp > money)
            return temp-money;

        else return 0;
    }
}
