package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {

        //creating a scanner
        Scanner bScan = new Scanner(System.in);

        //creating a String builder
        StringBuilder gr = new StringBuilder();

        //header
        System.out.println("Please provide the following information: ");

        //Ask the user their Full name
        System.out.println("Full name: ");
        String fullName = bScan.nextLine();

        // Ask the user their billing Street, City , State and Zipcode
        System.out.println("Billing Street: ");
        String billingStreet = bScan.nextLine();

        System.out.println("Billing city: ");
        String billingCity = bScan.nextLine();

        System.out.println("Billing zip: ");
        int billingZip = bScan.nextInt();
        bScan.nextLine();

        System.out.println("Billing State: ");
        String billingState = bScan.nextLine();

        //Ask user for Shipping Street, City, State, and Zipcode
        System.out.println("Shipping Street: ");
        String shippingStreet = bScan.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = bScan.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = bScan.nextLine();

        System.out.println("Shipping Zip: ");
        int shippingZip = bScan.nextInt();

        //Assembling the String builder

        gr.append(fullName).append("\n" +
                " ");
        gr.append(String.format("Billing Address: \n%s\n%s, %s %d\n\n",billingStreet,billingCity,billingState,billingZip));
        gr.append(String.format("Shipping Address: \n%s\n%s, %s  %d",shippingStreet, shippingCity , shippingState ,shippingZip));

        System.out.println("\n" + gr);

        //closing the scanner
        bScan.close();


    }
}
