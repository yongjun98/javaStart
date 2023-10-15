package programmersLv0;

public class ex112 {
    public static void main(String[] args) {
        int[] num_list = {4,2,6,1,7,6};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sum_odd += num_list[i];
            } else {
                sum_even += num_list[i];
            }
        }
        if (sum_odd > sum_even) {
            return sum_odd;
        }
        else return sum_even;
        }
    }


