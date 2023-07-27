package ex02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)");
        int a = sc.nextInt();
        int ten = a/10;
        int one = a%10;
        
        if(ten == one){
            System.out.println("Yes! 10의 자리와 1의자리가 같습니다.");
        }
        else{
            System.out.println("no! 다릅니다");
        }
    }
}
