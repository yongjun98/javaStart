package ex03;

import java.util.Scanner;
//패스 나중에 다시 풀것
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하세요>>");
        String str =sc.next();
        char c = str.charAt(0);
        for(int i=0; i<=c-'a'; i++ ){
            for(char j ='a'; j<= c-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
