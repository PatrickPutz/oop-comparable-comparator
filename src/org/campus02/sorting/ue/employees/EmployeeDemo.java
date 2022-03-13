package org.campus02.sorting.ue.employees;

import java.util.Arrays;
import java.util.Collections;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(123, "Pat", 2500.50, "R&D");
        Employee e2 = new Employee(23, "Leo", 2350.00, "IT");
        Employee e3 = new Employee(7, "Susi", 3000.00, "HR");

        Employee[] employees = { e2, e1, e3 };

        System.out.println("<<< Initial Array >>>");
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        Arrays.sort(employees);

        System.out.println("<<< Sorted Array >>>");
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

}
