package highschool;

/**
 * 
 * @author ishanmadan
 */

public class Classes {

    private String name;
    private int period;
    private String teacher;
    private String room;
    private String grade;

    public Classes (String inName, int inPeriod, String inTeacher, String inRoom, String inGrade) {
        name = inName;
        period = inPeriod;
        teacher = inTeacher;
        room = inRoom;
        grade = inGrade;
    }

    public String toString() {
        return name + ": P" + period + ", Teacher: " + teacher + ", Room: " + room + ", Grade: " + grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}