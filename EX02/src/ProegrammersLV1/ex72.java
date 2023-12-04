package ProegrammersLV1;

import java.util.Arrays;

public class ex72 {
    public static void main(String[] args) {
        int n = 5;
        int[]arr1 = {9, 20, 28, 18, 11};
        int[]arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    public static String cal(int n,int len){
        String str="";

        while(n != 0){
            str = n%2 + str;
            n/=2;
        }

        while(str.length() != len){
            str = "0"+str;
        }

        return str;
    }
    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i =0;i<n;i++){
            String str_x,str_y,str="";
            int x = arr1[i];
            int y = arr2[i];
            str_x = cal(x,n);
            str_y = cal(y,n);
            for(int j = 0;j<n;j++){
                if(str_x.charAt(j) == '1' || str_y.charAt(j) == '1') str+="#";
                else str+=" ";
            }
            answer[i] = str;
        }
        return answer;
    }
}
