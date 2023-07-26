package programmers;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//parameter : strlist
//return type : int []
public class 배열원소의길이 {
     public static void main(String[] args) {
          String strlist[] = {"We","are","the","world!"};
          System.out.println(Arrays.toString(solution(strlist)));
     }

     private static int[] solution(String[] strlist) {
          int[]answer = new int[strlist.length];
          int length =strlist.length;
          for(int i=0; i<length; i++){
               answer[i]=strlist[i].length();
          }
          return answer;
     }
}
