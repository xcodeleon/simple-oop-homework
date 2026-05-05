import app.PersonApp;
import entity.Employee;
import entity.Manager;
import entity.SaleManager;
import entity.WageEmployee;

public class Main {
    public static void main(String[] args) {

        System.out.println("=".repeat(80));
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В СИСТЕМУ УПРАВЛЕНИЯ ПЕРСОНАЛОМ");
        System.out.println("=".repeat(80));

        Employee[] employees = new Employee[10];

        employees[0] = new Manager("Иван Иванов", 35, true, "ООО ТехноМир", "Старший менеджер", 50000, 3);
        employees[1] = new Manager("Петр Петров", 42, true, "ООО ТехноМир", "Ведущий менеджер", 60000, 4);
        employees[2] = new Manager("Сергей Сергеев", 28, false, "ООО ТехноМир", "Младший менеджер", 40000, 2);


        employees[3] = new SaleManager("Анна Смирнова", 30, true, "ООО ТехноМир", "Региональный менеджер по продажам", 45000, 1500000, 15);
        employees[4] = new SaleManager("Елена Козлова", 33, false, "ООО ТехноМир", "Менеджер по продажам", 40000, 1200000, 12);
        employees[5] = new SaleManager("Дмитрий Морозов", 29, true, "ООО ТехноМир", "Ведущий менеджер по продажам", 50000, 2000000, 18);


        employees[6] = new WageEmployee("Мария Васильева", 25, false, "ООО ТехноМир", "Разработчик", 35000, 160, 500);
        employees[7] = new WageEmployee("Алексей Соколов", 27, true, "ООО ТехноМир", "Тестировщик", 30000, 140, 400);
        employees[8] = new WageEmployee("Ольга Новикова", 24, false, "ООО ТехноМир", "Аналитик", 38000, 150, 450);
        employees[9] = new WageEmployee("Владимир Кузнецов", 31, true, "ООО ТехноМир", "Системный администратор", 32000, 170, 480);


        PersonApp.printAllEmployees(employees);

        double totalSalary = PersonApp.calculateTotalSalary(employees);
        System.out.printf("\n💰 ОБЩИЕ ЗАТРАТЫ КОМПАНИИ НА ЗАРПЛАТЫ: %.2f руб.%n", totalSalary);

        double totalSales = PersonApp.calculateTotalSales(employees);
        System.out.printf("📊 ОБЩИЙ ДОХОД КОМПАНИИ (ОТ ПРОДАЖ): %.2f руб.%n", totalSales);

        Employee searchEmployee = employees[3]; // Анна Смирнова
        boolean found = PersonApp.findEmployee(employees, searchEmployee);
        System.out.printf("\n🔍 ПОИСК СОТРУДНИКА \"%s\": %s%n",
                searchEmployee.getName(),
                found ? "НАЙДЕН ✅" : "НЕ НАЙДЕН ❌");

        Employee notFoundEmployee = new Manager("Неизвестный", 99, false, "Неизвестно", "Неизвестно", 0, 1);

        boolean notFound = PersonApp.findEmployee(employees, notFoundEmployee);
        System.out.printf("🔍 ПОИСК СОТРУДНИКА \"%s\": %s%n",
                notFoundEmployee.getName(),
                notFound ? "НАЙДЕН ✅" : "НЕ НАЙДЕН ❌");

        System.out.println("\n" + "=".repeat(80));
        System.out.println("ТЕСТИРОВАНИЕ ПРОВЕРОК НА NULL");
        System.out.println("=".repeat(80));
        PersonApp.printAllEmployees(null);
        System.out.printf("Затраты при null массиве: %.2f%n", PersonApp.calculateTotalSalary(null));
        System.out.printf("Доход при null массиве: %.2f%n", PersonApp.calculateTotalSales(null));
        System.out.printf("Поиск в null массиве: %s%n", PersonApp.findEmployee(null, employees[0]));
        System.out.printf("Поиск null сотрудника: %s%n", PersonApp.findEmployee(employees, null));
    }
}
