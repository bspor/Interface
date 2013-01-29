
package myinterface;

public class SalaryBonusEmployee implements Employee {
    private double bonus;
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public SalaryBonusEmployee(double bonus, String employeeName, String employeeNumber, String hireDate) {
        this.bonus = bonus;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SalaryBonusEmployee{" + "bonus=" + bonus + ", employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + '}';
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
}
