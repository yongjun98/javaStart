package programmersLv0;

public class ex57 {
    public static void main(String[] args) {
        String [] str_list = {"abc","def","ghi"};
        String ex = "ef";
        System.out.println(solution(str_list,ex));
    }

    private static String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i<str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer+=str_list[i];
            }
        }
        return answer;
    }
}
