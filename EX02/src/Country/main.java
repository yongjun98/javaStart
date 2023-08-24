package Country;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String,Integer> nations = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
        while (true){
            System.out.print("나라 이름, 인구>>");
            String temp1 = sc.next();
            if(temp1.equals("그만")) break;
            int temp2 = sc.nextInt();
            nations.put(temp1,temp2);
        }
        while (true){
            System.out.print("인구 검색>>");
            String temp = sc.next();
            if(temp.equals("그만")) break;
            if(nations.get(temp)==null){
                System.out.println(temp+" 나라는 없습니다.");
            }
            else{
                System.out.println(temp+"의 인구는 "+nations.get(temp));
            }
        }
    }
}
