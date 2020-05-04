package app;

public class App {
    public static void main(String[] args) throws Exception {
        // Constructor - default consturctor (no parameter) and an override (inputs) but you only need one
        Person person = new Person("John Doe", 66, 15);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int height;
    private int age;

    public Person(String inName, int inHeight, int inAge) { // constructor
        // define variables
        name = inName;
        height = inHeight;
        age = inAge;
    }

    public Person() {
        name = "Andy Tree";
        height = 65;
        age = 15;
    }
    
    public String toString() {
        String heightString = height + " ";

        if (height == 1) {
            heightString += "inch tall";
        } else {
            heightString += "inches tall";
        }

        return name + ", age " + age + ", " + heightString;
    }
}