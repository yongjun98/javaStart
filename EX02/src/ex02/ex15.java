package ex02;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new int[4][4];
        int count =0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] =0;
            }
        }
        while(count<10){
            int row =(int)(Math.random()*4);
            int col =(int)(Math.random()*4);
            
            if(arr[row][col] != 0){
                continue;
            }
            else {
                arr[row][col] = (int)Math.round(Math.random()*9+1);
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
