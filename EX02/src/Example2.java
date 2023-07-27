class Power{
    public int kick;
    public int punch;
}
public class Example2 {
    public static void main(String[] args) {
        Power robot = new Power();
        robot.kick=10;
        robot.punch=20;
        System.out.println("킥은 = "+robot.kick+"펀치는 = "+robot.punch);
        System.out.println("펀치는 = "+robot.punch);
    }
}
