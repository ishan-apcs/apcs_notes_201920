package highschool;

/**
 * 
 * @author ishanmadan
 */

public class Student {
    
    String name;
    int age;
    double gpa;
    Classes[] schedule;

    public Student () {
        name = null;
        age = 0;
        gpa = 0.0;
        schedule = new Classes[7];
    }

    public Student (String inName, int inAge) {
        name = inName;
        age = inAge;
        gpa = 0.0;
        schedule = new Classes[7];
    }

    public String toString() {
        String returnString = name + ", Age: " + age + ", GPA: " + gpa + ", Classes: ";
        
        for (Classes studentClass : schedule) {
            returnString += (studentClass.getName() + ", ");
        }
        
        return returnString.substring(0, returnString.length() - 2);
    }

    public void createSchedule(Classes[] inSchedule) {
        schedule = inSchedule;
    }

    public void calculateGPA() {
        double total = 0;
        int classNum = 0;
        for (Classes item : schedule) {
            try {
                if (item.getGrade().equals("A+") || item.getGrade().equals("A") || item.getGrade().equals("A-")) {
                    total += 4;
                } else if (item.getGrade().equals("B+") || item.getGrade().equals("B") || item.getGrade().equals("B-")) {
                    total += 3;
                } else if (item.getGrade().equals("C+") || item.getGrade().equals("C") || item.getGrade().equals("C-")) {
                    total += 2;
                } else if (item.getGrade().equals("D+") || item.getGrade().equals("D") || item.getGrade().equals("D-")) {
                    total += 1;
                }

                if (item.getName().substring(0, 2).equals("AP")) {
                    total++;
                }

                classNum++;
            } catch (Exception e) {

            }
        }
        gpa = total / classNum;
    }

    public double getGPA() {
        return gpa;
    }
}