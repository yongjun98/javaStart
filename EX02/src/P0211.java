import java.util.Scanner;

public class P0211 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하시오");
        int num = s.nextInt();
        if(num % 3 == 0)
            System.out.println("3의 배수입니다.");
        else
            System.out.println("3의 배수가 아닙니다");
        s.close();
    }
}
