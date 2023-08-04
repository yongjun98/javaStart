package ex04;

class SampleClass{
    public int field1;
    protected int field2;
    int field3;
    public int field4; //private은 같은 클래스 내에서만 사용 가능
}
public class FieldAccess {
    public static void main(String[] args) {
        SampleClass fa = new SampleClass();
        fa.field1 = 0;
        fa.field2 = 1;
        fa.field3 = 2;
        fa.field4 = 3;
    }
}
