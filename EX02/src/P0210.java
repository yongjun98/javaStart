import java.util.Scanner;
public class P0210 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("점수를 입력하시오 : ");
        int score = s.nextInt();
        if(score >=80)
            System.out.println("축하합니다! 합격");
        s.close();
    }
}
