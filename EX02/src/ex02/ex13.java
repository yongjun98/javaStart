package ex02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 몇개?");
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j])
                    i--;
            }
        }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if ((i + 1) % 10 == 0)
                    System.out.println();

            }
        }
    }