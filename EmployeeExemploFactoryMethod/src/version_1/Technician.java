package version_1;

public class Technician extends Employee{
    private Double salary;

    public Technician(String name, Double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double getSalary() {
        return salary;
    }

    @Override
    void applyReadjustment() {
        salary *= 1.02;
    }
}
