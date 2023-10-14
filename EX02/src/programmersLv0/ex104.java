package programmersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex104 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        for(;;){
            if(n%2 == 0){
                n/=2;
                list.add(n);
            }
            else if(n==1){
                break;
            }
            else{
                n=3*n+1;
                list.add(n);
            }
        }
        int[]arr = list.stream().mapToInt(i->i).toArray();
        return arr;
    }
}
