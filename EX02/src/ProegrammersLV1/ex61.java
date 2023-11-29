package ProegrammersLV1;

import java.util.Arrays;

public class ex61 {
    public static void main(String[] args) {
        String[]participant = {"leo", "kiki", "eden"};
        String[]completion = {"eden", "kiki"};
        System.out.println(solution(participant,completion));
    }

    private static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
