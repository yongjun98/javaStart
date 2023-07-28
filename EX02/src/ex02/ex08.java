package ex02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("정수를 입력하세요");

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
