package ex02;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        System.out.println("소문자 알파벳 하나를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c;
        c= str.charAt(0);

        for(int i=0; i<= c-'a'; i++){
            for(char j ='a'; j <= c-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
