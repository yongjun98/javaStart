package ProegrammersLV1;

public class ex51 {
    public static void main(String[] args) {
        int[]nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int[] counts = new int[200001];
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(counts[nums[i]] == 0) {
                answer++;
            }
            counts[nums[i]]++;
        }
        if(answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        return answer;
    }
}
