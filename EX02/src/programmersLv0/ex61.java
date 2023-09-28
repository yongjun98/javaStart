package programmersLv0;

/*문자열 붙여서 출력하기*/

import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {

        System.out.print("붙이고 싶은 문자열을 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println("결과 : "+(a+b));
    }
}