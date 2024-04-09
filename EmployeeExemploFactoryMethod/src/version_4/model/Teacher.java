package version_4.model;

class Teacher extends Employee {

    private int hoursPerWeek;
    private double hourlyRate;

    public Teacher(String name, int hoursPerWeek, double hourlyRate) {
        super(name);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursPerWeek * 4.5;
    }

    @Override
    public void applyReadjustment() {
        hourlyRate *= 1.05;
    }
}
