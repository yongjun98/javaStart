package ex04;

import java.awt.print.Book;
import java.util.Scanner;

class Boook{
    String title,author;
    public Boook(String title, String author){
        this.title = title;
        this.author =author;
    }
}
public class BookArray {
    public static void main(String[] args) {
        Boook[] book = new Boook[2];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<book.length; i++){
            System.out.print("제목>>");
            String title = sc.nextLine();
            System.out.print("저자>>");
            String author =sc.nextLine();
            book[i] =new Boook(title,author);
        }
        for(int i=0; i<book.length; i++){
            System.out.println("("+book[i].title+","+book[i].author+")");
            sc.close();
        }
    }
}

