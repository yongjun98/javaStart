package ex03;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] =new int[num];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                arr[i] = arr[j];
                i--;
            }
        }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
                if((i+1)%10==0){
                    System.out.println();
                }
            }
        }
    }

