package CodingTest.day2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is even");
        }
        else if (a % 2 == 1) {
            System.out.println(a + " is odd");
        }
    }
}
