package programmersLv0;

import java.util.Arrays;

public class ex147 {
    public static void main(String[] args) {
        int n = 3;
        int[]numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numlist)));
    }

    private static int[] solution(int n, int[] numlist) {
       int count = 0;

       for(int i =0; i<numlist.length; i++){
           if(numlist[i]%n==0){
               count++;
           }
       }
       int [] answer = new int[count];
       int index = 0;
       for(int i=0; i<numlist.length; i++){
           if(numlist[i]%n==0){
               answer[index] = numlist[i];
               index++;
           }
       }
       return answer;
    }
}
