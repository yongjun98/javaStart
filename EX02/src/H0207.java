import java.util.Scanner;

public class H0207 {
    public static void main(String[] args) {
        System.out.println("점 (x,y)의 좌표를 입력하시오>>");
        Scanner s =new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        if((100<=x && x<=200)&&(100<=y && y<=200))
            System.out.println("사각형 안에 점이 있습니다");
        else
            System.out.println("사각형 안에 점이 없습니다");
        s.close();
    }
}
