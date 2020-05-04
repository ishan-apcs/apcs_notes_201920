package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // create a space in memory
        int[] array = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<Integer>(2);

        // get item
        int arrayItem = array[2];
        int arrayListItem = arrayList.get(2);

        // set/change
        array[2] = 7;
        arrayList.set(2, 7);

        // add item
        // not possible with standard Arrays
        arrayList.add(11); // append to end of ArrayList
        arrayList.add(2, 15); // insert at index 2

        // remove item
        // not possible with standard Arrays
        arrayList.remove(4); // removes object at index 4
        arrayList.remove(new Integer(7)); // removes Integer 7 object

        /** compare items
         * boolean, !boolean
         * boolean1 == boolean2, boolean1 != boolean 2
         * 
         * int1 == int2, int1 != int2, int1 < int2, int1 <= int 2, int1 > int2, int >= int2
         * doubles => same as ints
         * 
         * string1.equals(string2), string1.compareTo(string2)
         */

        /**
         * or => ||
         * and => &&
         * not => !
         */
    }
}