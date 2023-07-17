import java.util.Scanner;
public class P0204 {
    public static void main(String[] args) {
        System.out.println("이름,도시,나이,체중,독신 여부를 입력");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.print("이름은"+name+",");
        String city = s.next();
        System.out.print("도시"+city+",");
        int age =s.nextInt();
        System.out.print("나이"+age+"살,");
        double weight = s.nextDouble();
        System.out.print("체중은"+weight+"kg,");
        boolean single =s.nextBoolean();
        System.out.print("독신여부는"+single+"입니다.");
        s.close();
    }
}
