package version_3.model;

public class EmployeeFactory {

    public Employee factoryMethod(String name, int hoursPerWeek, double hourlyRate){
        return new Teacher(name, hoursPerWeek, hourlyRate);
    }

    public Employee factoryMethod(String name, Double salary){
        return new Technician(name, salary);
    }
}
