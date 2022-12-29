package HomeWork2;//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class Task2 {

    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "54321";

        StringBuilder stringBuilder = new StringBuilder(str1);
        String res = stringBuilder.reverse().toString();

        System.out.println(res.equals(str2));{
            if(res.equals(str2)){
                System.out.println("Строка является вращением первоначальной строки");
            }
            else{
                System.out.println("Строка не является вращением первоначальной строки");
            }
        }

    }


}