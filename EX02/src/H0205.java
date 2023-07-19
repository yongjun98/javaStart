import java.util.Scanner;

public class H0205 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("정수 3개를 입력");
        int I1=s.nextInt();
        int I2=s.nextInt();
        int I3=s.nextInt();
        if((I1+I2)<I3 || (I1+I3)<I1 || (I2+I3)<I1)
        System.out.println("삼각형을 만들 수 없습니다.");
        else
        System.out.println("삼각형이 됩니다.");
        s.close();
    }
}
