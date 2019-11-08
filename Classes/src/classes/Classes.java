/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * @author ishanmadan
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal msSebek = new Animal();
        System.out.println(msSebek);
        Animal anything = new Animal("Andrew", 4, 301, false);
        anything.setAge(15);
        System.out.println(anything);
    }
}
