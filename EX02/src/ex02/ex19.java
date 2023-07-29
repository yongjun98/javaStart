package ex02;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str [] ={"가위","바위","보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true){
            int n =(int)(Math.random()*3);
            System.out.print("가위 바위 보!!");
            String pstr =sc.next();
            if(pstr.equals("그만")){
                System.out.println("게임을 종료합니다.");
                break;
            }
            if(str[n].equals(pstr)){
                System.out.println("컴퓨터 = "+str[n]+", 사용자 ="+pstr+", 비겼습니다.");
            }
            else{
                if(str[n].equals("바위")){
                    if(pstr.equals("보")){
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 이겼습니다.");
                    }
                    else{
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 졌습니다.");
                    }
                }
                else if(str[n].equals("가위")){
                    if(pstr.equals("바위")){
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 이겼습니다.");
                    }
                    else{
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 졌습니다.");
                    }
                }
                else if(str[n].equals("보")){
                    if(pstr.equals("가위")){
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 이겼습니다.");
                    }
                    else{
                        System.out.println("컴퓨터 = "+str[n]+", 사용자 = "+pstr+", 졌습니다.");
                    }
                }
            }
        }
        sc.close();
    }
}
