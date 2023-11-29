package ProegrammersLV1;

public class ex62 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s,skip,index));
    }

    private static String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 1;
            while(count <= index){
                ++c;
                if(c > 'z')
                    c -= 26;
                if(skip.contains(c+""))
                    continue;
                else
                    count++;
            }
            answer += c;
        }
        return answer;
    }
}
