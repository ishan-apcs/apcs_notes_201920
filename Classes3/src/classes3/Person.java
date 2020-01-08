package classes3;

public class Person {
    private String name;
    private int age;
    private int inchHeight;
    private int cmHeight;

    public Person() {
        name = "";
        age = 0;
        inchHeight = 0;
        cmHeight = (int) (inchHeight * 2.54);
    }

    public Person(String inName) {
        name = inName;
    }
}