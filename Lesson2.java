public class Lesson2 {
    public static void main(String[] args){
        String s = "";
        long st = System.currentTimeMillis();
        for(int j = 0; j < 1000; j++){
            s += Character.getName(j);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - st);
        //System.out.println(s);
    }
}
