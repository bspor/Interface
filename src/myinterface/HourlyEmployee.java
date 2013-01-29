
package myinterface;

public class HourlyEmployee implements Employee {
    //Variable
    private double hourlyWage;
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public HourlyEmployee(double hourlyWage, String employeeName, String employeeNumber, String hireDate) {
        this.hourlyWage = hourlyWage;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
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

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
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
    public String toString() {
        return "HourlyEmployee{" + "hourlyWage=" + hourlyWage + ", employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + '}';
    }
    
    
}
