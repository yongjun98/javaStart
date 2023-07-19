import java.util.Scanner;
public class H0203 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("금액을 입력하시오");

        int num =s.nextInt();
        System.out.println("50000 원권"+num/50000+"매");
        num%=50000;
        System.out.println("10000won"+num/10000+"mae");
        num%=10000;
        System.out.println("5000won"+num/1000+"mae");
        num%=1000;
        System.out.println("100won"+num/100+"mae");
        num%=100;
        System.out.println("10won"+num/10+"mae");
        num%=10;
        System.out.println("1won"+num/1+"mae");
        s.close();
    }
}
