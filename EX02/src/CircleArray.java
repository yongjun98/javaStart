import java.util.Scanner;

class Circle {
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
public class CircleArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle[] c; //배열에 대한 레퍼런스 변수 c 선언
        c = new Circle[5]; // 레퍼런스 배열 생성
        for (int i = 0; i < c.length; i++) {
            System.out.print((i + 1) + "다음 숫자를 입력하세요");
            int radius = scanner.nextInt();
            c[i] = new Circle(radius);
        }//생성 과정 끝
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getArea() + " ");
        }
    }
}

