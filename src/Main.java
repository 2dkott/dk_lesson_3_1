import domain.Employee;
import domain.Employees;

public class Main {
    public static void main(String[] args) {

        Employees employees = new Employees();

        Employee employee1 = new Employee(1);
        employee1.setName("Василий");
        employee1.setMobileNumber("111-111-111");
        employee1.setWorkingMonthNumber(11);

        Employee employee2 = new Employee(2);
        employee2.setName("Василий");
        employee2.setMobileNumber("222-222-222");
        employee2.setWorkingMonthNumber(12);

        Employee employee3 = new Employee(3);
        employee3.setName("Василий");
        employee3.setMobileNumber("333-333-333");
        employee3.setWorkingMonthNumber(11);

        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);

        employees.printEmployees();

        System.out.printf("Найти телефон сотрудника %s%n", employee1.getName());
        System.out.println(employees.showNumber(employee1.getName()));

        System.out.printf("Найти сотрудников по стажу %s%n", 11);
        System.out.println(employees.findByWorkingMonthNumbers(11));

        System.out.printf("Найти сотрудника по табельному номеру %s%n", employee3.getNumber());
        System.out.println(employees.getEmployeeByNumber(employee3.getNumber()));

        System.out.printf("Проверка добления сотрудника который был уже добавлен %s%n", employee3.getName());
        employees.addEmployee(employee3);

    }
}