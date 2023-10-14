package programmersLv0;

public class ex106 {
    public static void main(String[] args) {
        int[] date1 = {2021,12,28};
        int[] date2 = {2021,12,29};
        System.out.println(solution(date1,date2));
    }

    private static int solution(int[] date1, int[] date2) {
        if(date1[0] != date2[0]){
            return date1[0] <date2[0]?1:0;
        }
        if(date1[1] != date2[1]) {
            return date1[1] < date2[1] ? 1 : 0;
        }
        if(date1[2] != date2[2]) {
            return date1[2] < date2[2] ? 1 : 0;
        }
        return 0;
    }
}
