package exemplo2;

public class Developer implements IDeveloper{
	
	private final String name;
	private final Double salary;
	
	public Developer(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary.doubleValue();
	}
	
}
