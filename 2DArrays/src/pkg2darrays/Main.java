/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrays;

/**
 *
 * @author ishanmadan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] students = {"Ally", "Bob", "Cati", "Doug", "Ethel","Frank"};

        int[][] multipleAssignments = {{5,6,7,8,9,10},  {5,6,8,4,9,4}, {5,3,9,6,9,8}};        

        int rows = multipleAssignments.length;

        int cols = multipleAssignments[0].length;

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
        }
        System.out.println();
        for (int[] row : multipleAssignments) {
            for (int grade : row) {
                System.out.print(grade + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
            for (int[] row : multipleAssignments) {
                System.out.print(row[i] + "\t");
            }
            System.out.println();
        }
    }
    
}