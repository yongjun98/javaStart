public class Circle {
    public int radius;
    public String name;

    public Circle(){

    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Circle pizza; //Circle 객체를 가리킬 래퍼런스 변수
        pizza = new Circle();// Circle() 이름의 함수 실행, 생성자 실행
        pizza.radius = 10;
        pizza.name = "자바 피자";
        double area = pizza.getArea();
        System.out.println("피자의 면적은 = " +area);

        Circle donut;
        donut = new Circle();
        donut.radius = 2;
        donut.name = "자바 도넛";
        area = donut.getArea();
        System.out.println("도넛의 면적은 ="+area);
    }
}
