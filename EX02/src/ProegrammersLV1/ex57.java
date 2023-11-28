package ProegrammersLV1;

import java.util.Arrays;

public class ex57 {
    public static void main(String[] args) {
        int n = 5;
        int[]arr1 = {9, 20, 28, 18, 11};
        int[]arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    private static String getBinary(int n, int num){
        String binary = Integer.toBinaryString(num);
        int len = binary.length();
        for(int i=0; i<n-len; i++) binary = "0" + binary;
        return binary;
    }
    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str = "";
            String line1 = getBinary(n, arr1[i]);
            String line2 = getBinary(n, arr2[i]);
            for (int j = 0; j < n; j++) {
                if (line1.charAt(j) == '1' || line2.charAt(j) == '1')
                    str += "#";
                else str += " ";
            }
            answer[i] = str;
        }
        return answer;
    }
}
