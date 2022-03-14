package org.campus02.sorting.ue.employees;

import java.util.Arrays;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(123, "Pat", 2300.00, "R&D");
        Employee e2 = new Employee(23, "Frank", 2800.00, "IT");
        Employee e3 = new Employee(7, "Susi", 2000.00, "HR");
        Employee e4 = new Employee(20, "Leo", 2300.00, "IT");

        Employee[] employees = { e2, e1, e3, e4 };

        System.out.println("<<< Initial Array >>>");
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        Arrays.sort(employees);

        System.out.println("<<< Sorted Array >>>");
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("<<< NameAscComparator >>>");
        Arrays.sort(employees, new NameAscComparator());
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("<<< SalaryDescComparator >>>");
        Arrays.sort(employees, new SalaryDescComparator());
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }


        System.out.println("<<< DepartmentAscNameDescComparator >>>");
        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("<<< SalaryAscNameAscComparator >>>");
        Arrays.sort(employees, new SalaryAscNameAscComparator());
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

    }

}
