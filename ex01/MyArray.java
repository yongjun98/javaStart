package ex01;

import java.util.Scanner;

public class MyArray {

    public static void pr(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
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
    public static void main(String[] args) {
        Scanner scanner; //래퍼런스 변수
        scanner = new Scanner(System.in);

        int [] intArray;
        intArray = new int[7];
        // intArray = new int[5];
        System.out.println("정수"+intArray.length+"개를 입력하세요");
        for(int i=0; i<intArray.length; i++){
            intArray[i] =scanner.nextInt();
        }

        pr(intArray);
        int max = big(intArray);

        System.out.println("제일 큰값은"+max);
        }
        scanner.close();
    }
}
