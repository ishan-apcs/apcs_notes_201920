/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;

/**
 *
 * @author ishanmadan
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = {8, 6, 1, 4, 3, 5, 2};
        // bubbleSortArray(array1);
        // selectionSortArray(array1);
        // selectionSortArray2(array1);
        // insertionSortArray(array1);
        array1 = jonathanSort(array1);
        for (int i : array1) {
            System.out.println(i);
        }

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(8);
        array2.add(6);
        array2.add(3);
        array2.add(4);
        array2.add(7);
        array2.add(5);
        array2.add(2);
        // bubbleSortArrayList(array2);
        // selectionSortArrayList(array2);
        // insertionSortArrayList(array2);
        array2 = andrewSort(array2);
        System.out.println(array2);
    }

    public static void bubbleSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void bubbleSortArrayList(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                if (array.get(j) > array.get(j+1)) {
                    Integer temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);
                }
            }
        }
    }

    public static void selectionSortArray(int[] array) {
        int[] newArray = new int[array.length];
        int size = array.length;
        for (int i = 0; i < size; i++) {
            Integer temp = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                }
            }
            newArray[i] = temp;
            array[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < size; i++) {
            array[i] = newArray[i];
        }
    }

    public static void selectionSortArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void selectionSortArrayList(ArrayList<Integer> array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            Integer temp = array.get(0);
            for (int j = 0; j < array.size(); j++) {
                if (array.get(j) < temp) {
                    temp = array.get(j);
                }
            }
            newArray.add(temp);
            array.remove(temp);
        }
        // System.out.println(newArray);
        for (int i = 0; i < size; i++) {
            array.add(newArray.get(i));
        }
    }

    public static void insertionSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowest = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[lowest]) {
                    lowest = j;
                }
            }
            int temp = array[lowest];
            array[lowest] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSortArrayList(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int lowest = i;
            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < array.get(lowest)) {
                    lowest = j;
                }
            }
            int temp = array.get(lowest);
            array.set(lowest, array.get(i));
            array.set(i, temp);
        }
    }

    public static void insertionSortArrayList2(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            
        }
    }

    public static ArrayList<Integer> andrewSort(ArrayList<Integer> array) {
        int count = 0;
        while (!checkSort(array)) {
            count++;
            ArrayList<Integer> indexArray = new ArrayList<Integer>();
            ArrayList<Integer> newArray = new ArrayList<Integer>();

            for (int i = 0; i < array.size(); i++) {
                int index = (int)(Math.random() * array.size());

                while (indexArray.indexOf(index) != -1) {
                    index = (int)(Math.random() * array.size());
                }

                newArray.add(array.get(index));
                indexArray.add(index);
            }
            array = newArray;
        }

        System.out.println(count);
        return array;
    }

    public static int[] jonathanSort(int[] array) {
        int count = 0;
        while (!checkSort2(array)) {
            count++;
            ArrayList<Integer> indexArray = new ArrayList<Integer>();
            ArrayList<Integer> indexArray2 = new ArrayList<Integer>();
            int[] newArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                int index = (int)(Math.random() * array.length);

                while (indexArray.indexOf(index) != -1) {
                    index = (int)(Math.random() * array.length);
                }

                int index2 = (int)(Math.random() * array.length);

                while (indexArray2.indexOf(index2) != -1) {
                    index2 = (int)(Math.random() * array.length);
                }

                newArray[index2] = array[index];
                indexArray.add(index);
                indexArray2.add(index2);
            }
            array = newArray;
        }

        System.out.println(count);
        return array;
    }

    public static boolean checkSort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i+1)) {
                return false;
            }
        }

        return true;
    }
    
    public static boolean checkSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }

        return true;
    }
}
