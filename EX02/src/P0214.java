import java.util.Scanner;

public class P0214 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("커피메뉴를 선택하시오");
        String order =s.next();
        int price=0;
        switch (order){
            case "에스프레소" :
            case "카푸치노" :
            case "카페라뗴" :
                price =3500; break;
            case  "아메리카노" :
                price =2000; break;
            default:
                System.out.println("메뉴에 없습니다");
        }
        if(price!=0)
            System.out.println(order+"는"+price+"원입니다");
        s.close();
    }
}