package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        ArrayList<Integer> array = new ArrayList<Integer>();
        // how to traverse through a list
        // forward
        for (int i = 0; i < array.size(); i++) {

        }
        
        // backward
        for (int i = array.size() - 1; i >= 0; i--) {

        }

        // remove all elements
        for (int i = 0; i < array.size(); i++) {
            array.remove(i);
            i--; // necessary if you're traversing forwards
            // if there's no i--, only about half the elements will be removed (when traversing forwards)
            // if you include i-- when traversing backwards, a similar effect will occur
            // you might also cause an IndexOutOfBoundsError
        }

        // remove all elements relating to a certain criteria
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == 0) {
                array.remove(i);
                i--;
            }
        }
    }
}