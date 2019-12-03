/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes2;

/**
 *
 * @author ishanmadan
 */
public class Classes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee squirtle = new Employee("Squirtle", 2, 15.0, false, "616", 1);
        System.out.println(squirtle);
        squirtle.raiseSalary(1000);
        for (int i = 0; i < 100; i++)
            squirtle.grow();
        System.out.println(squirtle);
        System.out.println(squirtle.isRetired());
        System.out.println(squirtle.getWorkID());
    }
    
}
