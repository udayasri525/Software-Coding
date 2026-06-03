package core_project;

import java.util.*;
import java.io.*;

//User Class
class User {
    String username;
    String password;

    User(String u, String p) {
        username = u;
        password = p;
    }
}

//Record Class
class Record {
    int id;
    String name;
    String contact;
    String category;
    String status;

    Record(int id, String name, String contact, String category, String status) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.category = category;
        this.status = status;
    }
}

//Service Class
class BankingService {

    Scanner sc = new Scanner(System.in);

    Map<String, User> users = new HashMap<>();
    Map<Integer, Record> records = new HashMap<>();

    // Constructor → load data
    BankingService() {
        loadUsers();
        loadRecords();
    }

    // ================= USERS FILE =================

    void loadUsers() {
        try {
            File file = new File("users.txt");
            if (!file.exists()) return;

            Scanner fileSc = new Scanner(file);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                String[] data = line.split(",");
                users.put(data[0], new User(data[0], data[1]));
            }
            fileSc.close();
        } catch (Exception e) {
            System.out.println("Error loading users");
        }
    }

    void saveUsers() {
        try {
            PrintWriter pw = new PrintWriter("users.txt");
            for (User u : users.values()) {
                pw.println(u.username + "," + u.password);
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving users");
        }
    }

    // ================= RECORDS FILE =================

    void loadRecords() {
        try {
            File file = new File("records.txt");
            if (!file.exists()) return;

            Scanner fileSc = new Scanner(file);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                String[] d = line.split(",");
                int id = Integer.parseInt(d[0]);
                records.put(id, new Record(id, d[1], d[2], d[3], d[4]));
            }
            fileSc.close();
        } catch (Exception e) {
            System.out.println("Error loading records");
        }
    }

    void saveRecords() {
        try {
            PrintWriter pw = new PrintWriter("records.txt");
            for (Record r : records.values()) {
                pw.println(r.id + "," + r.name + "," + r.contact + "," + r.category + "," + r.status);
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving records");
        }
    }

    // ================= FEATURES =================

    void register() {
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        users.put(u, new User(u, p));
        saveUsers();

        System.out.println("Registration Successful!");
    }

    boolean login() {
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        if (users.containsKey(u) && users.get(u).password.equals(p)) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid Login!");
            return false;
        }
    }

    void addRecord() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (records.containsKey(id)) {
            System.out.println("Duplicate ID!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Contact: ");
        String contact = sc.next();

        System.out.print("Enter Category: ");
        String category = sc.next();

        System.out.print("Enter Status: ");
        String status = sc.next();

        records.put(id, new Record(id, name, contact, category, status));
        saveRecords();

        System.out.println("Record Added!");
    }

    void updateRecord() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (!records.containsKey(id)) {
            System.out.println("Not Found!");
            return;
        }

        Record r = records.get(id);

        System.out.print("Enter New Name: ");
        r.name = sc.next();

        System.out.print("Enter New Contact: ");
        r.contact = sc.next();

        System.out.print("Enter New Category: ");
        r.category = sc.next();

        System.out.print("Enter New Status: ");
        r.status = sc.next();

        saveRecords();
        System.out.println("Updated!");
    }

    void deleteRecord() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (records.remove(id) != null) {
            saveRecords();
            System.out.println("Deleted!");
        } else {
            System.out.println("Not Found!");
        }
    }

    void searchRecord() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (records.containsKey(id)) {
            Record r = records.get(id);
            System.out.println(r.id + " " + r.name + " " + r.contact + " " + r.category + " " + r.status);
        } else {
            System.out.println("Not Found!");
        }
    }

    void viewRecords() {
        if (records.isEmpty()) {
            System.out.println("No Records!");
            return;
        }

        for (Record r : records.values()) {
            System.out.println(r.id + " " + r.name + " " + r.contact + " " + r.category + " " + r.status);
        }
    }

    void generateReport() {
        int active = 0, inactive = 0;

        for (Record r : records.values()) {
            if (r.status.equalsIgnoreCase("active"))
                active++;
            else
                inactive++;
        }

        System.out.println("Total: " + records.size());
        System.out.println("Active: " + active);
        System.out.println("Inactive: " + inactive);
    }
}

//Main Class
public class Main {
    public static void main(String[] args) {

        BankingService bs = new BankingService();
        Scanner sc = new Scanner(System.in);

        boolean loggedIn = false;

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1.Register 2.Login 3.Add 4.Update 5.Delete 6.Search 7.View 8.Report 9.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: bs.register(); break;
                case 2: loggedIn = bs.login(); break;
                case 3: if (loggedIn) bs.addRecord(); else System.out.println("Login First"); break;
                case 4: if (loggedIn) bs.updateRecord(); else System.out.println("Login First"); break;
                case 5: if (loggedIn) bs.deleteRecord(); else System.out.println("Login First"); break;
                case 6: if (loggedIn) bs.searchRecord(); else System.out.println("Login First"); break;
                case 7: if (loggedIn) bs.viewRecords(); else System.out.println("Login First"); break;
                case 8: if (loggedIn) bs.generateReport(); else System.out.println("Login First"); break;
                case 9: System.out.println("Thank You"); return;
                default: System.out.println("Invalid");
            }
        }
    }
}