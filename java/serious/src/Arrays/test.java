package Arrays;

import java.util.Scanner;


class Employee {
    private String employeeName;
    private int employeeId;
    private String department;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


class ProjectEmployee extends Employee {

    private String projectName;
    private String projectRole;

    int[] performance = new int[3];

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    public void inputPerformance(Scanner sc) {
        for (int i = 0; i < performance.length; i++) {
            System.out.println("Enter Month " + (i + 1) + " Score:");
            performance[i] = sc.nextInt();
        }
    }

   
    public void displayPerformance() {
        System.out.println("Performance Scores:");
        for (int p : performance) {
            System.out.println(p);
        }
    }

   
    public void displayAverage() {
        int sum = 0;
        for (int p : performance) {
            sum += p;
        }
        double avg = (double) sum / performance.length;
        System.out.println("Average Performance = " + avg);
    }
}


public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProjectEmployee obj = new ProjectEmployee();

       
        System.out.println("Enter Employee Name:");
        obj.setEmployeeName(sc.nextLine());

        System.out.println("Enter Employee ID:");
        obj.setEmployeeId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Department:");
        obj.setDepartment(sc.nextLine());

        System.out.println("Enter Project Name:");
        obj.setProjectName(sc.nextLine());

        System.out.println("Enter Project Role:");
        obj.setProjectRole(sc.nextLine());

     
        obj.inputPerformance(sc);

        boolean status = true;

      
        while (status) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Update Project Role");
            System.out.println("2. Update Project Name");
            System.out.println("3. View Employee Profile");
            System.out.println("4. View Average Performance");
            System.out.println("5. Exit");

            System.out.println("Choose Option:");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter New Project Role:");
                    obj.setProjectRole(sc.nextLine());
                    break;

                case 2:
                    System.out.println("Enter New Project Name:");
                    obj.setProjectName(sc.nextLine());
                    break;

                case 3:
                    System.out.println("\n--- Employee Details ---");
                    System.out.println("Name: " + obj.getEmployeeName());
                    System.out.println("ID: " + obj.getEmployeeId());
                    System.out.println("Department: " + obj.getDepartment());
                    System.out.println("Project Name: " + obj.getProjectName());
                    System.out.println("Project Role: " + obj.getProjectRole());
                    obj.displayPerformance();
                    break;

                case 4:
                    obj.displayAverage();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    status = false;
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }

        sc.close();
    }
}
