package version_1;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double getSalary();

    abstract void applyReadjustment();
}
