package collections;

import java.util.*;

// Employee Class
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

// Task Class
class Task {
    int taskid;
    String taskName;
    String assignedTo;

    public Task(int taskid, String taskName, String assignedTo) {
        this.taskid = taskid;
        this.taskName = taskName;
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "Task [taskid=" + taskid + ", taskName=" + taskName + ", assignedTo=" + assignedTo + "]";
    }
}

// SupportRequest Class (PriorityQueue needs Comparable)
class SupportRequest implements Comparable<SupportRequest> {
    int requestId;
    String employeeName;
    String issue;

    public SupportRequest(int requestId, String employeeName, String issue) {
        this.requestId = requestId;
        this.employeeName = employeeName;
        this.issue = issue;
    }

    @Override
    public int compareTo(SupportRequest other) {
        return this.requestId - other.requestId; // priority
    }

    @Override
    public String toString() {
        return "SupportRequest [requestId=" + requestId + ", employeeName=" + employeeName + ", issue=" + issue + "]";
    }
}

// Main Class
public class mainclass {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        LinkedList<Task> tasks = new LinkedList<>();
        Queue<SupportRequest> supportQueue = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);

        boolean status = true;

        while (status) {

            System.out.println("\nChoose option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Assign Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Add Support Request");
            System.out.println("6. Process Support Request");
            System.out.println("7. Highest Salary");
            System.out.println("8. Increase Salary");
            System.out.println("9. Exit");

            int choice = scan.nextInt();

            switch (choice) {

                // Add Employee
                case 1: {
                    System.out.println("Enter employee id:");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter employee name:");
                    String name = scan.nextLine();

                    System.out.println("Enter salary:");
                    double salary = scan.nextDouble();

                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee added successfully!");
                    break;
                }

                // Display Employees
                case 2: {
                    if (employees.isEmpty()) {
                        System.out.println("No employees found!");
                    } else {
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    break;
                }

                // Assign Task
                case 3: {
                    System.out.println("Enter task id:");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter task name:");
                    String name = scan.nextLine();

                    System.out.println("Assign to:");
                    String assign = scan.nextLine();

                    tasks.add(new Task(id, name, assign));
                    System.out.println("Task assigned!");
                    break;
                }

                // Display Tasks
                case 4: {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available!");
                    } else {
                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                    }
                    break;
                }

                // Add Support Request
                case 5: {
                    System.out.println("Enter request id:");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter employee name:");
                    String name = scan.nextLine();

                    System.out.println("Enter issue:");
                    String issue = scan.nextLine();

                    supportQueue.add(new SupportRequest(id, name, issue));
                    System.out.println("Support request added!");
                    break;
                }

                // Process Support Request (PriorityQueue FIX)
                case 6: {
                    if (supportQueue.isEmpty()) {
                        System.out.println("No support requests!");
                    } else {
                        System.out.println("Processing requests:");
                        while (!supportQueue.isEmpty()) {
                            System.out.println(supportQueue.poll());
                        }
                    }
                    break;
                }

                // Highest Salary
                case 7: {
                    if (employees.isEmpty()) {
                        System.out.println("No employees!");
                    } else {
                        Employee max = employees.get(0);

                        for (Employee e : employees) {
                            if (e.salary > max.salary) {
                                max = e;
                            }
                        }
                        System.out.println("Highest Salary Employee:");
                        System.out.println(max);
                    }
                    break;
                }

                // Increase Salary
                case 8: {
                    System.out.println("Enter increment percentage:");
                    double percent = scan.nextDouble();

                    for (Employee e : employees) {
                        e.salary += e.salary * percent / 100;
                    }

                    System.out.println("Salary updated successfully!");
                    break;
                }

                // Exit
                case 9: {
                    status = false;
                    System.out.println("Exiting program...");
                    break;
                }

                default:
                    System.out.println("Invalid choice!");
            }
        }
        scan.close();
    }
}