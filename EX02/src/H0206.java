import java.util.Scanner;

public class H0206 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int num =s.nextInt();

        if(num!=0 && num>=1 && num<=99) {
            int a, b;
            a = num / 10;
            b = num % 10;

            if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
                System.out.println("박수짝짝");
            } else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
                System.out.println("박수짝");
            }
        }
            else {
                System.out.println("숫자의 범위를 벗어났습니다.");
            }
            s.close();
        }
    }
