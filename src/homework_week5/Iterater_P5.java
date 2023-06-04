package homework_week5;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Iterater_P5 {
    public static void main(String[] args) {
        elements();
    }
    public static void elements(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over ArrayList:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }

}
