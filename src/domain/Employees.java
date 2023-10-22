package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Employees {
    private final List<Employee> employeeList = new ArrayList<>();

    public List<Employee> findByWorkingMonthNumbers(int monthNumbers) {
        return employeeList.stream().filter(employee -> employee.getWorkingMonthNumber()==monthNumbers).toList();
    }

    public String showNumber(String employeeName) {
        return employeeList.stream().filter(employee -> employee.getName().equals(employeeName)).findFirst().orElseThrow().getMobileNumber();
    }

    public Employee getEmployeeByNumber(int number) {
        return employeeList.stream().filter(employee -> employee.getNumber()==number).findFirst().orElseThrow();
    }

    public void addEmployee(Employee employee) {
        if (isEmployeeAdded(employee.getNumber())) {
            System.out.printf("Сотрудник с номером %s уже добавлен%n", employee.getNumber());
        }
        employeeList.add(employee);
    }

    private boolean isEmployeeAdded(int employeeId) {
        try {
            employeeList.stream().filter(employee -> employee.getNumber()==employeeId).findFirst().orElseThrow();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void printEmployees() {
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
