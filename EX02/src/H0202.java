import java.util.Scanner;

public class H0202 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("2자리의 정수 입력(10~99)>>");
        int num = s.nextInt();
        if (num >= 10 && num < 100) {
            if (num / 10 == num % 10) {
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
            } else {
                System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
            }
        }else {
                System.out.println("2의 자리 정수가 아닙니다");
            }
            s.close();

        }
    }
