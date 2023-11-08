package ProegrammersLV1;

public class ex20 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    private static String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        int len = num.length;
        for(int i = 0; i < len; i++) {
            if(i < len - 4)
                answer += "*";
            else
                answer += num[i];
        }
        return answer;
    }
}
