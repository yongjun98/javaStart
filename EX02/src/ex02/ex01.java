package ex02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원) >>");
        int won = sc.nextInt();

        double realWon = (double) won / 1000;
        System.out.println(won +"원은 $" + realWon);
    }
}
