package ex01;

import java.util.Scanner;

public class MyArray {

<<<<<<< Updated upstream
    public static void pr(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
            System.out.println("커밋 꼭해라 이용준");
=======
    public static void pr(int[] a) {
        for (int k : a) {
            System.out.print(k + " ");// k = a[i]의 읽어온 값
>>>>>>> Stashed changes
        }
    }
    public static int big(int [] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }

    public static void read(int[] a) {
        Scanner scanner; //래퍼런스 변수
        scanner = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i] =scanner.nextInt();
        }
    }
    public static void main(String[] args) {

        int [] intArray;
        intArray = new int[7];
        // intArray = new int[5];
        System.out.println("정수"+intArray.length+"개를 입력하세요");
        read(intArray);
        pr(intArray);
        int max = big(intArray);

        System.out.println("제일 큰값은"+max);
        }
    }
