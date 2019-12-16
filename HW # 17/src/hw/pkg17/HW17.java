/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg17;

/**
 *
 * @author ishanmadan
 */
public class HW17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        problem23();
    }

    public static void addCentury(Date recent, Date old) {
        old.addYears(100);
        recent = old;
        System.out.println(recent);
        System.out.println(old);
    }

    public static void problem23() {
        Date oldDate = new Date(1, 13, 1900);
        Date recentDate = null;
        addCentury(recentDate, oldDate);

        System.out.println(recentDate);
        System.out.println(oldDate);
        
        Date newDate;

        // System.out.println(newDate);
    }

    public static void problem22() {
        Date d1 = new Date();
        Date d2 = d1;

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        System.out.println(d1.x);
        System.out.println(d2.x);

        d1.x = 10;
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        System.out.println(d1.x);
        System.out.println(d2.x);

        Date d3 = new Date();
        Date d4 = d3;

        System.out.println(d3);
        System.out.println(d4);

        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));

        System.out.println(d3.x);
        System.out.println(d4.x);

        d4.x = 10;
        System.out.println(d3);
        System.out.println(d4);

        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));

        System.out.println(d3.x);
        System.out.println(d4.x);
    }
    
}
