import java.util.Random;
import java.util.ArrayList;
import javax.swing.table.TableStringConverter;

public class HomeWork1 {
    public static void main(String[] args) {
        int i = 0;
        int n;
        
        i = randNumber();
        n = MSB(i);

        ArrayList<Integer> m1 = new ArrayList<Integer>();//Задание номер 3
        for ( int j = i ; j < Short.MAX_VALUE; j++) {
            if (j % n == 0 ) m1.add(j);
        }
        System.out.println(m1);

        ArrayList<Integer> m2 = new ArrayList<Integer>();//Задание номер 4
        for ( int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0 ) m2.add(j);
        }
        System.out.println(m2);

        System.out.println("Случайное целое число в диапозоне от 0 до 2000 = "+i);
        System.out.println("Номер старшего бита числа "+ i +" = " + n);
    }

    public static int randNumber(){
        return new Random().nextInt(2001); //Задание номер 1.
    }
    
    public static int MSB(int i){
        System.out.println("Число "+i+" в двоичной системе = "+Integer.toBinaryString(i));
        return Integer.toBinaryString(i).length();//Задание номер 2
    }
    
}
