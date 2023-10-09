package programmersLv0;

public class ex90 {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        System.out.println(solution(myString));
    }

    private static String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a","A");
        return myString;
    }
}
