package ProegrammersLV1;

public class ex49 {
    public static void main(String[] args) {
        String[]cards1 = {"i", "drink", "water"};
        String[]cards2 = {"want", "to"};
        String[]goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards2,cards1,goal));
    }

    private static String solution(String[] cards2, String[] cards1, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for (String currentStr : goal) {

            if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
