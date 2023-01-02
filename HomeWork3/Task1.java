package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("green");
        colours.add("red");
        colours.add("yellow");
        colours.add("purple");
        colours.add("white");


        for (String str : colours) {
            System.out.println(str);
        }

        System.out.println();

        Iterator<String> stringIterator = colours.listIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + "!");
        }

        System.out.println();

        colours.add(0, "brown");
        for (String str : colours) {
            System.out.println(str);
        }

        System.out.println();

        colours.remove(3);
        for (String str : colours) {
            System.out.println(str);
        }

        System.out.println();

        colours.set(1, "black");
        for (String str : colours) {
            System.out.println(str);
        }

        System.out.println();

        colours.remove(3);
        for (String str : colours) {
            System.out.println(str);
        }

        System.out.println();

        if (colours.contains("brown")) {
            System.out.println("Brown содержится в списке под индексом-" + colours.indexOf("brown"));
        } else
            System.out.println("Такого цвета в списке нет");


        ArrayList<String> newColours = new ArrayList<>();
        newColours.add("Pink");
        newColours.add("Orange");
        newColours.add("Blue");
        newColours.addAll(0, colours.subList(0, 2));

        System.out.println();

        for (String str : newColours) {
            System.out.println(str);
        }
        System.out.println(newColours);

        System.out.println();

        colours.removeAll(newColours);

        for (String res : newColours) {
            System.out.println(res);
        }
       colours.sort(String::compareTo);
        for (String res : colours) {
            System.out.println(res);
        }

    }
}

