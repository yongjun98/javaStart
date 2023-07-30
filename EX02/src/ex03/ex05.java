package ex03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int [] unit = {50000,10000,1000,500,100,50,10,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();

        for(int i=0; i<unit.length; i++){
            System.out.printf("%d원짜리 : %d개\n",unit[i],money/unit[i]);
            money = money-(money/unit[i])*unit[i];
        }
        sc.close();
    }
}
