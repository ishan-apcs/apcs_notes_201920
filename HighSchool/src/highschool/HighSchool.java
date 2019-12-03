/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschool;

/**
 *
 * @author ishanmadan
 */
public class HighSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Classes multimedia = new Classes("Multimedia Arts", 1, "Mr. Salcedo", "Oberlin", "A+");
        Classes apCalcBC = new Classes("AP Calculus BC", 2, "Mr. Dhillon", "Cornell", "A+");
        Classes apush = new Classes("AP US History", 3, "Ms. Rodriguez", "Oxford", "A");
        Classes spanish3 = new Classes("Spanish 3", 4, "Mr. Mendoza", "Johns Hopkins", "A+");
        Classes physics = new Classes("Physics", 5, "Mr. Buchanan", "Georgia Tech", "A+");
        Classes english11 = new Classes("English 11", 6, "Ms. Gong-Guy", "Johns Hopkins", "A+");
        Classes apcs = new Classes("AP Computer Science", 7, "Ms. Sebek", "Oberlin", "A+");

        Classes[] schedule = {multimedia, apCalcBC, apush, spanish3, physics, english11, apcs};

        Student ishan = new Student("Ishan", 11);

        ishan.createSchedule(schedule);
        ishan.calculateGPA();
        System.out.println(ishan.toString());
    }
    
}
