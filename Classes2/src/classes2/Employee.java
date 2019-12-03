package classes2;

/**
 * @author ishanmadan
 */

public class Employee {
    
    private String name;
    private int age;
    private double salary;
    private boolean retired;
    private int yearsAtCompany;
    private String workID;

    public Employee() {
        name = null;
        age = -1;
        salary = -1;
        workID = null;
        yearsAtCompany = -1;
    }

    public Employee(String name, int age, double salary, boolean retired, String workID, int yearsAtCompany) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.retired = retired;
        this.workID = workID;
        this.yearsAtCompany = yearsAtCompany;
    }

    public void raiseSalary(double percentRaise) {
        salary *= (1 + percentRaise);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isRetired() {
        int conditions = 0;
        if (age >= 65)
            conditions++;
        if (salary > 20000)
            conditions++;
        if (yearsAtCompany > 30);
            conditions++;
        
        retired = conditions >= 2;
        
        return retired;
    }

    public String getWorkID() {
        return workID;
    }

    public String toString() {
        return name + " is " + age + " years old. Their salary is " + salary + ", their work ID is " + workID + " and they've been at the company for " + yearsAtCompany + " years.";
    }

    public void grow() {
        age++;
    }
}