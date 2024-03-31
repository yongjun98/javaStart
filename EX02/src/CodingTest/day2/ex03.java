package CodingTest.day2;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int num = a.length();
        for(int i = 0; i < num; i++){
            System.out.println(a.charAt(i));
        }
    }
}
