package programmersLv0;

public class ex56 {
    public static void main(String[] args) {
        int n =0;
        String control ="wsdawsdassw";
        System.out.println(solution(n,control));
    }

    private static int solution(int n, String control) {
        int answer = n;
        String[] controlList = control.split("");

        for(int i = 0; i < controlList.length; i++){
            if(controlList[i].equals("w")){
                answer += 1;
            } else if(controlList[i].equals("s")){
                answer -= 1;
            } else if(controlList[i].equals("d")){
                answer += 10;
            } else if(controlList[i].equals("a")){
                answer -= 10;
            }
        }
        return answer;
    }
}
