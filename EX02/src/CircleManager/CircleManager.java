package CircleManager;

import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
}
public class CircleManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Circle c[] = new Circle[3];

        for(int i=0; i<c.length; i++){
            System.out.print("x,y,radius>>");
            double a =sc.nextDouble();
            double b =sc.nextDouble();
            int d =sc.nextInt();
            c[i] = new Circle(a,b,d);
        }
        for(int i=0; i<c.length; i++)
            c[i].show();
        sc.close();
    }
}
