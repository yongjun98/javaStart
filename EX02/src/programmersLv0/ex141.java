package programmersLv0;

public class ex141 {
    public static void main(String[] args) {
        String my_string = "abcdevwxyz";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch < 'l') {
                sb.append('l');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
