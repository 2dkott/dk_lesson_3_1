package domain;

public class Employee {
    private int number;
    private String mobileNumber;
    private String name;
    private int workingMonthNumber;

    public Employee(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingMonthNumber() {
        return workingMonthNumber;
    }

    public void setWorkingMonthNumber(int workingMonthNumber) {
        this.workingMonthNumber = workingMonthNumber;
    }

    @Override
    public String toString() {
        return String.format("Номер: %s \nИмя: %s \nСтаж(мес.): %s \nТел.номер: %s \n", number, name, workingMonthNumber, mobileNumber);
    }
}
