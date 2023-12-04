package ProegrammersLV1;

public class ex73 {
    public static void main(String[] args) {
        int[]numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    private static String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;
        int right = 12;

        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4||numbers[i] == 7){
                answer+="L";
                left = numbers[i];
                continue;
            }else if(numbers[i] == 3 || numbers[i] == 6||numbers[i] == 9){
                answer+="R";
                right = numbers[i];
                continue;
            }else{
                int x = numbers[i] == 0 ? 11 : numbers[i];
                int l_length = Math.abs((x-1)/3 - (left-1)/3) + Math.abs((x-1)%3 - (left-1)%3);
                int r_length = Math.abs((x-1)/3 - (right-1)/3) + Math.abs((x-1)%3 - (right-1)%3);
                if(l_length == r_length) {
                    if(hand.equals("right")){
                        answer+="R";
                        right = x;
                    }else{
                        answer+="L";
                        left=x;
                    }
                }
                else {
                    if(l_length<r_length){
                        answer+="L";
                        left=x;
                    }else{
                        answer+="R";
                        right=x;
                    }
                }
            }
        }

        return answer;
    }
}
