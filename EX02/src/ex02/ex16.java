package ex02;

public class ex16 {
    public static void main(String[] args) {
        int i =1;
        while(i<100) {
            int count = 0;
            if ((i/10 == 3) || (i/10) == 6 || (i/10) == 9) {
                count++;
            }
            if ((i%10)==3 || (i%10) ==6 || (i%10)==9){
                count++;
            }
            if(count ==1){
                System.out.println(i+" 박수 짝");
            }
            if(count ==2){
                System.out.println(i+" 박수 짝짝");
            }
            i++;
        }
    }
}
