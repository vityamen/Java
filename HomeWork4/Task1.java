package HomeWork4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {

   
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> familia = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> patromics = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Boolean> gender  = new ArrayList<>();

        ArrayList<String> persons= new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите через пробел Фамилию, Имя , Отчество, возраст и пол");
        
       
        while (sc1.hasNextLine()) {
            
            String person = sc1.nextLine();
            if(person.equals("stop")){
                break;
            }
            else persons.add(person);
        }
        
        System.out.println(persons);
    
    for (String person : persons){
        String [] tmp = person.split( " ");
        familia.add(tmp[0]);
        names.add(tmp[1]);
        patromics.add((tmp[2]));
        ages.add(Integer.parseInt(tmp[3]));
        if(tmp[4].contains("M")){
            gender.add(true);
        }
        else gender.add(false);        
    }
    System.out.println(familia);
    System.out.println(names);
    System.out.println(patromics);
    System.out.println(ages);
    System.out.println(gender);
    sortAges(ages);
    System.out.println(ages);
    sortGender(gender);
    System.out.println(gender);
    sortFamilia(familia);
    System.out.println(familia);






}  
   /**
 * 
 */
static void sortAges(ArrayList<Integer> list){
    Collections.sort(list);
   }

static void sortGender(ArrayList<Boolean> list){
    Collections.sort(list);
   }   
static void sortFamilia(ArrayList<String> list){
    Collections.sort(list);
   }    

}   
