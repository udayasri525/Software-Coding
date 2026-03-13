package project1;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.Scanner;

// Custom Functional Interface
interface EligibilityChecker {
    boolean checkEligibility(double average);
}

// Student Class
class Student {

    private int studentId;
    private String studentName;
    private int[] marks = new int[3];

    public Student(int studentId, String studentName, int[] marks) {

        this.studentId = studentId;
        this.studentName = studentName;

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i] < 0 || marks[i] > 100)
            {
                throw new IllegalArgumentException("Marks should be between 0 and 100");
            }
            this.marks[i] = marks[i];
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int[] getMarks() {
        return marks;
    }

    public int calculateTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public void displayStudentDetails() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);

        System.out.print("Marks : ");
        for(int m : marks)
        {
            System.out.print(m + " ");
        }

        System.out.println("\nTotal Marks : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
    }
}

// Main Class
public class Example1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Enter Student ID : ");
            int studentId = scan.nextInt();

            scan.nextLine();

            System.out.print("Enter Student Name : ");
            String studentName = scan.nextLine();

            int[] marks = new int[3];

            System.out.println("Enter Marks");

            for(int i=0;i<marks.length;i++)
            {
                System.out.print("Module " + (i+1) + " : ");
                marks[i] = scan.nextInt();
            }

            Student s = new Student(studentId, studentName, marks);

            // Predicate → Pass/Fail
            Predicate<Double> passCheck = avg -> avg >= 35;

            // Custom Functional Interface
            EligibilityChecker eligible = avg -> avg >= 40;

            // Function → Grade
            Function<Double,String> gradeFunction = avg -> {

                if(avg >= 75)
                    return "Grade A";
                else if(avg >= 60)
                    return "Grade B";
                else if(avg >= 50)
                    return "Grade C";
                else
                    return "Grade D";
            };

            // Consumer → Print Details
            Consumer<Student> display = st -> {

                st.displayStudentDetails();

                double avg = st.calculateAverage();

                System.out.println("Result : " +
                        (passCheck.test(avg) ? "PASS" : "FAIL"));

                System.out.println("Grade : " +
                        gradeFunction.apply(avg));

                System.out.println("Eligibility : " +
                        (eligible.checkEligibility(avg)
                                ? "Eligible for Certificate"
                                : "Not Eligible for Certificate"));
            };

            display.accept(s);

        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }

      finally {
    	  scan.close();
      }
    }
}