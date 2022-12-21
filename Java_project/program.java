package Java_project;

public class program {
    public static void main(String[] args) {
        int a = 123;
        int b,c,d = 0;
        a = a--;
        //b = --a;
        //c = a - b;
        d = a-- - --a;
        System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        System.out.println(d);
    }
}
