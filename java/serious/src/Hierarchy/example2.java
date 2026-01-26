package Hierarchy;

class Employee {
    String name;
    int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int calculateAnnualSalary() {
        return 12 * this.baseSalary;
    }
}

class Manager extends Employee {
    int bonus;
    int numberOfEmployeesManaged;

    public Manager(String name, int baseSalary, int bonus, int numberOfEmployeesManaged) {
        super(name, baseSalary);
        this.bonus = bonus;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    public int calculateManagerSalary() {
        return 12 * this.baseSalary + this.bonus;
    }
}

class Engineer extends Employee {
    int projectCount;

    public Engineer(String name, int baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    public int calculateEngineerSalary() {
        int projectBonus = 1000 * this.projectCount;
        return 12 * this.baseSalary + projectBonus;
    }
}

class Salesperson extends Employee {
    double commissionRate;
    double totalSales;

    public Salesperson(String name, int baseSalary, double commissionRate, double totalSales) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    double calculateSalespersonSalary() {
        double commission = totalSales * commissionRate;
        return 12 * baseSalary + commission;
    }
}

public class example2 {
    public static void main(String[] args) {

        Employee manager = new Manager("Alice", 50000, 10000, 5);
        System.out.println(manager.calculateAnnualSalary());
        System.out.println(((Manager) manager).calculateManagerSalary());
        
        System.out.println("------------------------");
        Employee engineer = new Engineer("Bob", 70000, 5);
        System.out.println(engineer.calculateAnnualSalary()); // Calls the method from the base class
        System.out.println(((Engineer) engineer).calculateEngineerSalary());
        System.out.println("------------------------");
        Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
        System.out.println(salesperson.calculateAnnualSalary()); // Calls the method from the base class
        System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
    }
}
