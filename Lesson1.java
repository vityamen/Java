import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        int[] ints = new int[10];

    
        Random random = new Random();
    
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1024);
        }

        for (int i: ints) {
            System.out.println(i);
        }
    
    }
}

