package exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Company implements IDeveloper{
	
	private String name;
	private List<IDeveloper> devs;
	
	public Company(String name) {
		this.name = name;
		this.devs = new ArrayList<IDeveloper>();
	}
	
	public String getName() {
		return name;
	}

	public void addDev(IDeveloper dev) {
		if(dev != null) {
			devs.add(dev);
		}
	}

	@Override
	public double getSalary() {
		double sum = 0;
		for(IDeveloper dev : devs) {
			sum += dev.getSalary();
		}
		return sum;
	}
	
	
}
