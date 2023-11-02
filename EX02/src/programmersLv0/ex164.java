package programmersLv0;

public class ex164 {
    public static void main(String[] args) {
        String[]order={"cafelatte", "americanoice", "hotcafelatte", "anything"};
        System.out.println(solution(order));
    }

    private static int solution(String[] order) {
        int answer = 0;
        for(String str:order) {
            if(str.contains("cafelatte")) {
                answer+=5000;
            } else {
                answer+=4500;
            }
        }
        return answer;
    }
}
