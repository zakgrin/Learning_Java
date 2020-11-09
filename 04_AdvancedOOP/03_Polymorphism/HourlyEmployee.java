public class HourlyEmployee extends Employee {
    
    private double hourlyWage; 
    private double hoursWorked;
    
    // Constructor: 
    public HourlyEmployee(String name, String idNumber, double hourlyWage, double hoursWorked) {
        super(name, idNumber);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
    }
    
    // Setters: 
    public void setHourlyWage(double hourlyWage) {
        // to avoid values by minurs: 
        if (hourlyWage > 0.0 ) {
            this.hourlyWage = hourlyWage;
        } else {
            this.hourlyWage = 0.0; 
        }
    }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked > 0.0 ) {
            this.hoursWorked = hoursWorked;
        } else {
            this.hoursWorked = 0.0; 
        }
    }
    
    // Getters:
    public double getHourlyWage() {
        return hourlyWage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    // Supporters: 
    @Override
    public double earnings() {
        return getHourlyWage() * getHoursWorked();
    }
    
    @Override
    public String toString() {
        return String.format("This is an hourly employee: \n" + 
                             "%s" + 
                             " - Hourly Wage: %s \n" + 
                             " - Worked Hours: %s \n" + 
                             " - Salary: %s \n", 
                             super.toString(), 
                             getHourlyWage(),
                             getHoursWorked(),
                             earnings());
    }
}
