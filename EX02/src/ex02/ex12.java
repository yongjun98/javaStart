package ex02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int num [] = new int [10];
        double sum = 0;
        System.out.print("랜덤한 정수들>>");
        for(int i=0; i<num.length; i++){
            num[i] = (int)(Math.random()*10+1); //math.random *10+1은 1~10에서 +1을 안할시 0~9
            System.out.print(num[i]+" ");
            sum += num[i];
        }
        System.out.println();
        System.out.println("평균은"+(sum/ num.length));
    }
}
