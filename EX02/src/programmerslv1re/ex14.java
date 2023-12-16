package programmerslv1re;

import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    char tmp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = tmp;
                }
            }
        }
        String newstr = new String();
        for(int i =0; i< arr.length; i++){
            newstr += arr[i];
        }
        answer=Long.parseLong(newstr);
        return answer;
    }
}
