/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ishanmadan
 */
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        List<Integer> num = new ArrayList<Integer>();
        List<Integer> num2 = new ArrayList();

        list1.add("John");
        // list1.add("Mary");
        list1.add("Harry");
        list1.add("Louis");

        list1.add(1, "Mary");

        System.out.println(""); */

        ArrayList<String> list1 = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Double> list3 = new ArrayList();

        list1.add("Tobenna");
        list1.add("Jonathan");
        list1.add("Joe");
        list1.add("Andrew");
        list1.add("Cory");
        list1.add(0, "Amy");
        list1.set(1, "Chidubem");
        list1.add("Andrew");
        list1.add("Andrew");
        list1.remove(4);
        list1.remove("Andrew");
        System.out.println(list1);

        /* for (int i = 0; i < list1.size(); i++) {
            if ("Cory".equals(list1.get(i))) {
                System.out.println(i);
                break;
            }
        } */

        list2.add(4);
        list2.add(2);
        list2.add(0);

        // list2.remove(0);
        
        Integer place = 4;// new Integer(4); // would remove the object 4
        list2.remove(place);

        int place2 = 1; // would remove the position 1
        list2.remove(place2);

        System.out.println(list2);

        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(2);
        list4.add(3);
        list4.add(5);
        list4.add(7);
        list4.add(9);
        list4.add(12);
        list4.add(13);
        list4.add(15);
        list4.add(21);
        list4.add(24);
        list4.add(26);
        list4.add(28);
        list4.add(35);
        list4.add(37);

        System.out.println(binaryIntSearch(list4, 16));

        ArrayList<String> list5 = new ArrayList<String>();

        list5.add("aargh");
        list5.add("Aarhus");
        list5.add("Aarika");
        list5.add("Aaron");
        list5.add("Aaronic");
        list5.add("Aaronical");
        list5.add("Aaronite");
        list5.add("Aaronitic");
        list5.add("Aaron's-beard");
        list5.add("Aaronsburg");
        list5.add("Aaronson");
        list5.add("AARP");
        list5.add("aarrgh");
        list5.add("aarrghh");
        list5.add("Aaru");
        list5.add("AAS");
        list5.add("A'asia");
        list5.add("aasvogel");
        list5.add("aasvogels");
        list5.add("AAU");
        list5.add("AAUP");
        list5.add("AAUW");
        list5.add("AAVSO");
        list5.add("AAX");
        list5.add("A-axes");
        list5.add("A-axis");

        System.out.println(binaryStringSearch(list5, "Aaronite"));
    }

    public static int linearStringSearch(ArrayList<String> list, String term) {
        for (int i = 0; i < list.size(); i++) {
            if (term.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryIntSearch(ArrayList<Integer> list, int term) {
        int min = 0;
        int max = list.size() - 1;
        int mid = (min + max)/2;

        int aMid = list.get(mid);
        
        while (term != aMid) {
            if (min == mid || mid == max) {
                return -1;
            } else if (term < aMid) {
                max = mid;
                mid = (min + max)/2;
            } else if (term > aMid) {
                min = mid;
                mid = (min + max)/2;
            }

            aMid = list.get(mid);
        }

        return mid;
    }

    public static int binaryStringSearch(ArrayList<String> list, String term) {
        int min = 0;
        int max = list.size() - 1;
        int mid = (min + max)/2;

        String aMid = list.get(mid);
        
        while (!term.equals(aMid)) {
            if (min == mid || mid == max) {
                return -1;
            } else if (term.compareTo(aMid) < 0) {
                max = mid;
                mid = (min + max)/2;
            } else if (term.compareTo(aMid) > 0) {
                min = mid;
                mid = (min + max)/2;
            }

            aMid = list.get(mid);
        }

        return mid;
    }
}
