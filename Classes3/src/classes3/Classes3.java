/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes3;

/**
 *
 * @author ishanmadan
 */
public class Classes3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Person prashant = new Person();

        // System.out.println(prashant);

        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope(); // slope1 is assigned -1.25 
        boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0
        
        System.out.println(slope1);
        System.out.println(onLine1);

        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope(); // slope2 is assigned 0.625 
        boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 ≠ 0
        
        System.out.println(slope2);
        System.out.println(onLine2);
    }
    
}
