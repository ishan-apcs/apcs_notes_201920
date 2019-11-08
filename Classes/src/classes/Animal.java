/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ishanmadan
 */
public class Animal {

    private String name;
    private int legs;
    private int age;
    private boolean extinct;

    // default constructor
    public Animal() {
        name = "Sainirnay";
        legs = 5;
        age = 300;
        extinct = false;
    }

    // override constructor
    public Animal(String inName, int inLegs, int inAge, boolean inExtinct) {
        name = inName;
        legs = inLegs;
        age = inAge;
        extinct = inExtinct;
    }

    public void setAge(int inAge) {
        age = inAge;
    }

    // how you would like your object to print
    public String toString() {
        return (name + " " + legs + " " + age + " " + extinct);
    }
}
