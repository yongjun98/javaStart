package ex04;
import java.util.Scanner;
    class ex01 {
    private String mf;
    private int year;
    private int inch;
    ex01(String mf, int year, int inch){
        this.mf =mf;
        this.year = year;
        this.inch = inch;
    }
    public void show(){
        System.out.println(mf+"에서 만든 "+year+"년형 "+inch+"인지 TV");
    }
}
class main {
    public static void main(String[] args) {
       ex01 myTV = new ex01("LG",2017,32);
       myTV.show();
       ;
    }
}
