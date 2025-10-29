package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;

//Employee 클래스
class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//EmployeeDTO 클래스
class EmployeeDTO {
    String displayName;
    String salaryInfo;
    // constructor, getters

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }

    public class StreamEx {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("Kim", 50000),
                    new Employee("Lee", 60000)
            );

            List<EmployeeDTO> employeeDTOs = employees.stream()
                    .map(Employee::toDto)
                    .toList();

            System.out.println(employees);
            System.out.println(employeeDTOs);

        }
    }
}


