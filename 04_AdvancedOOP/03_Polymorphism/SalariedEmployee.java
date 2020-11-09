public class SalariedEmployee extends Employee {
    // Variables:
    private double monthlySalary;
    // Constructor: 
    public SalariedEmployee(String name, String idNumber, double salary) {
        super(name, idNumber);
        setMonthlySalary(salary);
    }
    // Setters: 
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0 ) {
            this.monthlySalary = monthlySalary;
        }
        else {
            this.monthlySalary = 0.0;
        }
    }
    // Getters: 
    public double getMonthlySalary() {
        return monthlySalary;
    }
    // Helpers: 
    @Override
    public String toString() {
        return String.format("This is an salaried employee: \n" + 
                             "%s" + 
                             " - Salary: %s", 
                            super.toString(), 
                             earnings());
    }
    @Override
    public double earnings() {
        return getMonthlySalary();
    }
}
