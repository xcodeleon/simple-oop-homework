package app;

import entity.Employee;
import entity.Person;
import entity.SaleManager;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.Objects;

@UtilityClass
public class PersonApp {

    public void printAllEmployees(Employee[] employees) {
        if (employees == null) {
            System.out.println("Ошибка: массив сотрудников не инициализирован (null)");
            return;
        }

        System.out.println("\n" + "=".repeat(80));
        System.out.println("ИНФОРМАЦИЯ О ВСЕХ СОТРУДНИКАХ");
        System.out.println("=".repeat(80));

//        for (Employee employee : employees) {
//            if (employee != null) {
//                employee.display();
//                System.out.println();
//            }
//        }

        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .forEach(Person::display);
    }

    public double calculateTotalSalary(Employee[] employees) {
        if (employees == null) {
            throw new NullPointerException("Ошибка: массив сотрудников не инициализирован (null)");
        }

//        double totalSalary = 0.0;
//        for (Employee employee : employees) {
//            if (employee != null) {
//                totalSalary += employee.calculateSalary();
//            }
//        }
//        return totalSalary;
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public double calculateTotalSales(Employee[] employees) {
        if (employees == null) {
            throw new NullPointerException("Ошибка: массив сотрудников не инициализирован (null)");
        }

//        double totalSales = 0.0;
//        for (Employee employee : employees) {
//            if (employee instanceof SaleManager) {
//                SaleManager sm = (SaleManager) employee;
//                totalSales += sm.getTotalSales();
//            }
//        }
//        return totalSales;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee -> (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }


    public boolean findEmployee(Employee[] employees, Employee target) {
        if (employees == null || target == null) {
            System.out.println("Ошибка: массив сотрудников не инициализирован (null)");
            return false;
        }

        return Arrays.asList(employees).contains(target);
    }
}
