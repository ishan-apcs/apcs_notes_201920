/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ishanmadan
 */
public class People {
    
    public static void main(String[] args) {
        Person jonathan = new Person("Jonathan", 15, 10);
        Person ishan = new Person("Ishan", 14, 11);
        Person andrew = new Person("Andrew", 15, 10);

        List people = new ArrayList<Person>();
        
        people.add(jonathan);
        people.add(ishan);
        people.add(andrew);
        
//        for (Person person : people) {
//            person.export();
//        }

    }
}

class Person {

    /**
     * @param args the command line arguments
     */
    
    public String name;
    public int age;
    public int grade;
        
    public Person(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public void export() {
        System.out.println(name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
}