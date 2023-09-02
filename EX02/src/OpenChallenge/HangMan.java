package OpenChallenge;

import java.util.*;
import java.io.*;

class Word{
    private String eng;
    Word(String eng){
        this.eng=eng;
    }
    String getEng() {
        return this.eng;
    }
}

public class HangMan {

    static Vector<Word> v=new Vector<Word>();

    static String randomWord() {
        int r=(int)(Math.random()*v.size());
        return v.get(r).getEng();
    }

    static void setPlay(boolean visited[], String eng) {
        for(int i=0;i<visited.length;i++) {
            visited[i]=true;
        }

        int tmp=-1;
        for(int i=0;i<2;i++) {
            int r=(int)(Math.random()*eng.length());
            if(!visited[r]) i--;
            else {
                if(i==1) {
                    if(eng.charAt(tmp)!=eng.charAt(r)) visited[r]=false;
                    else i--;
                }
                else {
                    tmp=r;
                    visited[r]=false;
                }
            }
        }

        return;
    }

    static void playGame(boolean visited[], String eng, Scanner scanner) {
        int collect_Cnt=0;
        for(int i=0;i<5;i++) {
            for(int j=0;j<eng.length();j++) {
                if(visited[j]) System.out.print(eng.charAt(j));
                else System.out.print("-");
            }
            System.out.println();

            System.out.print(">>");
            String user_Answer=scanner.next();
            for(int j=0;j<eng.length();j++) {
                if(!visited[j] && eng.charAt(j)==user_Answer.charAt(0)) {
                    visited[j]=true;
                    collect_Cnt++;
                }
            }

            if(collect_Cnt==2) {
                for(int j=0;j<eng.length();j++) {
                    if(visited[j]) System.out.print(eng.charAt(j));
                }
                System.out.println();
                return;
            }
        }
        System.out.println("5번 실패하였습니다.");
        return;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner;

        try {
            scanner=new Scanner(new FileReader("C:\\Temp\\test.txt"));
            while(scanner.hasNext()){
                String word=scanner.nextLine();
                v.add(new Word(word));
            }
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        scanner=new Scanner(System.in);
        System.out.println("지금부터 행맨 게임을 시작합니다.");

        while(true) {
            String eng=randomWord();
            boolean visited[]=new boolean[eng.length()];
            setPlay(visited, eng);
            playGame(visited, eng, scanner);

            System.out.print("Next(y/n)?");
            String next_Op=scanner.next();
            if(next_Op.charAt(0)=='n') {
                System.out.println("행맨 게임을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }

}