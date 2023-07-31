package ex03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        int count = 0;

        while (true) {
            System.out.println("과목이름>>");
            String name = sc.next();
            if (name.equals("그만")) {
                break;
            }
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    System.out.println(course[i] + "의 점수는" + score[i]);
                    count++;
                }
            }
            if (count == 0)
                System.out.println("없는 과목입니다.");
        }
            sc.close();
        }
    }



