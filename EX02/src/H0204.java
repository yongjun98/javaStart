import java.util.Scanner;

public class H0204 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("정수 3개 입력");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a < b && b < c) {
            System.out.println("중간 값은" + b + "입니다");
        }
        if (b < a && a < c) {
            System.out.println("중간값은" + a + "입니다");
        } else {
            System.out.println("중간값은" + c + "입니다");
        }
        s.close();
    }
}
