package com.packages;

import java.util.Scanner;

// Parent Class
public class VehicleManagement {

    private String ownerName;
    private String vehicleNumber;
    private String vehicleType;

    public VehicleManagement(String ownerName, String vehicleNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public void profile() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Vehicle Type    : " + vehicleType);
    }
}

// Child Class
class ServiceVehicle extends VehicleManagement {

    private String serviceCenterName;
    private String serviceCategory;

    public ServiceVehicle(String serviceCenterName,
                          String serviceCategory,
                          String ownerName,
                          String vehicleNumber,
                          String vehicleType) {

        super(ownerName, vehicleNumber, vehicleType);
        this.serviceCenterName = serviceCenterName;
        this.serviceCategory = serviceCategory;
    }

    public void updateServiceName(String newServiceCenterName) {
        if (newServiceCenterName == null || newServiceCenterName.equals("")) {
            System.out.println("Please enter valid service center name");
        } else {
            serviceCenterName = newServiceCenterName;
        }
    }

    public void updateServiceCategory(String newServiceCategory) {
        if (newServiceCategory == null || newServiceCategory.equals("")) {
            System.out.println("Please enter valid service category");
        } else {
            serviceCategory = newServiceCategory;
        }
    }

    public void profileDetails() {
        System.out.println("\n------ Vehicle Profile Details ------");
        profile();
        System.out.println("Service Center  : " + serviceCenterName);
        System.out.println("Service Category: " + serviceCategory);
    }
}

// Main Class
class VehicleApp{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter owner name:");
        String ownerName = scan.next();

        System.out.println("Enter vehicle number:");
        String vehicleNumber = scan.next();

        System.out.println("Enter vehicle type:");
        String vehicleType = scan.next();

        System.out.println("Enter service center name:");
        String serviceCenterName = scan.next();

        System.out.println("Enter service category:");
        String serviceCategory = scan.next();

        ServiceVehicle obj =
            new ServiceVehicle(serviceCenterName, serviceCategory,
                               ownerName, vehicleNumber, vehicleType);

        int select = 0;

        while (select != 4) {

            System.out.println("\n1. Update Service Category");
            System.out.println("2. Update Service Center Name");
            System.out.println("3. View Vehicle Profile Details");
            System.out.println("4. Exit");
            System.out.print("Select option: ");

            select = scan.nextInt();

            switch (select) {

                case 1:
                    System.out.println("Enter new service category:");
                    String newService = scan.next();
                    obj.updateServiceCategory(newService);
                    System.out.println("Service category updated successfully");
                    break;

                case 2:
                    System.out.println("Enter new service center name:");
                    String newName = scan.next();
                    obj.updateServiceName(newName);
                    System.out.println("Service center name updated successfully");
                    break;

                case 3:
                    obj.profileDetails();
                    break;

                case 4:
                    System.out.println("Thank you 👍 Program ended.");
                    break;

                default:
                    System.out.println("Please select valid option only!");
            }
        }

        scan.close();
    }
}
