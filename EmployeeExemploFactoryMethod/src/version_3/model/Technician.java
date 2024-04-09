package version_3.model;

class Technician extends Employee {
    private Double salary;

    public Technician(String name, Double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void applyReadjustment() {
        salary *= 1.02;
    }
}
