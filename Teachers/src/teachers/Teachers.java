/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachers;

/**
 *
 * @author ishanmadan
 */
public class Teachers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] teacherSubject = new String[32][2];
        
        teacherSubject[0][0] = "Sebek";
        teacherSubject[0][1] = "APCS";
        
        teacherSubject[1][0] = "Wustrow";
        teacherSubject[1][1] = "Math";
        
        teacherSubject[2][0] = "Dhillon";
        teacherSubject[2][1] = "Math";
        
        teacherSubject[3][0] = "Sato";
        teacherSubject[3][1] = "Chemistry";
        
        teacherSubject[4][0] = "Mendoza";
        teacherSubject[4][1] = "Spanish";
        
        /* for (int row = 0; row < teacherSubject.length; row++) {
            if (teacherSubject[row][0] != null) {
                if (teacherSubject[row][1].toLowerCase().equals("math"))
                    System.out.println("Name: " + teacherSubject[row][0] + "\tSubject: " + teacherSubject[row][1]);
            } else {
                // System.out.println("There is no valid entry at row " + (row + 1) + ".");
            }
        } */
        for (String[] row : teacherSubject) {
            if (row[0] != null)
                if (row[1].toLowerCase().equals("math"))
                    System.out.println("Name: " + row[0] + "\tSubject: " + row[1]);
        }
    }
    
}
