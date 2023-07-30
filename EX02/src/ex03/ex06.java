package ex03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] =new int[10];
        double sum =0;
        System.out.print("랜덤한 정수들");

        for(int i=0; i< num.length; i++){
            num[i] =(int)(Math.random()*10+1);
            System.out.print(num[i]+" ");
            sum+= num[i];
        }
        System.out.println();
        System.out.println("평균은"+sum/num.length);
    }
}
