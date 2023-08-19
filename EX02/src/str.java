import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String s = sc.nextLine();
            if(s.equals("그만")){
                System.out.println("종료합니다....");
                break;
            }
            String str[] = s.split(" ");
            System.out.println("어절 개수는 "+str.length);
        }
    }
}
