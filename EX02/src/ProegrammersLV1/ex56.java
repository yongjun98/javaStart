package ProegrammersLV1;

public class ex56 {
    public static void main(String[] args) {
        String[]babbling = {"aya", "yee", "u", "maa"};
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()  == 0) answer++;

        }
        return answer;
    }
}
