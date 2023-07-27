package ex02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99사이의 정수를 입력하시오>>");

        int a = sc.nextInt();
        int ten = a/10; //10의자리수
        int one = a%10;

        if (a<10){
            if(one == 3 || one == 6 || one ==9){
                System.out.println("박수 짝");
            }
        }
        else {
            if(one == 3 || one == 6 || one ==9){
                if(ten == 3 || ten ==6 || ten ==9){
                    System.out.println("박수 짝짝");
                }
                else {
                    System.out.println("박수짝");
                }
            }
        }
    }
}
