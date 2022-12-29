package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static class stringContains {
        String text;

        public void setTxt(String text) {
            this.text = text;
        }

        public String getTxt() {
            return text;
        }

        public void contains(String text1, String text2) {
            if (text1.contains(text2)) {
                System.out.println("Строка - '" + text1 + "' содержит в себе строку '" + text2+ "'");
            } else
                System.out.println("Строки разные");
        }

        public static void main(String[] args) throws IOException {
            stringContains word1 = new stringContains();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку 1:");
            word1.setTxt(bufferedReader.readLine());
            stringContains e = new stringContains();
            System.out.println("Введите строку 2:");
            e.setTxt(bufferedReader.readLine());
            e.contains(word1.getTxt(), e.getTxt());
        }
    }
}
