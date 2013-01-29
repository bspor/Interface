
package myinterface;

public class SalariedEmployee implements Employee {
    private double salary;
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public SalariedEmployee(double salary, String employeeName, String employeeNumber, String hireDate) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }   

    @Override
    public String employeeName(String employeeName) {
        getEmployeeName();
        return employeeName;

    }

    @Override
    public String employeeNumber(String employeeNumber) {
         getEmployeeNumber();
         return employeeNumber;
    }

    @Override
    public String hireDate(String hireDate) {
        getHireDate();
        return hireDate;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + '}';
    }
}
