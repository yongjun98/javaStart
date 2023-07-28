package ex02;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int m = sc.nextInt();

        if (m >= 3 && m <= 5) {
            System.out.print("봄");
        } else if (m >= 6 && m <= 8) {
            System.out.print("여름");
        } else if (m >= 9 && m <= 11) {
            System.out.print("가을");
        } else {
            System.out.print("겨울");
        }
    }
}
