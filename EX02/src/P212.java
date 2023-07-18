import java.util.Scanner;

public class P212 {
    public static void main(String[] args) {
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = s.nextInt();
        if(score>=90)
            grade='A';
        if(score>=80)
            grade='B';
        if(score>=70)
            grade='C';
        if(score>=60)
            grade='D';
        else
            grade='F';
        System.out.println("학점은"+grade+"입니다");
        s.close();
    }
}
