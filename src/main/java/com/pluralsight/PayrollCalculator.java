package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {

    public static void main(String[] args) {

        String fileName = "employees.csv";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String employeeName = tokens[1];
                double hours = Double.parseDouble(tokens[2]);
                double rate = Double.parseDouble(tokens[3]);

                Employees employee = new Employees(employeeName, id, hours, rate);

                System.out.printf("ID: %d | Name: %s | Gross Pay: %.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getGrossPay());
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Problem reading file: " + fileName);
        }

    }

}
