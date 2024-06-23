package exemplo2;

public class Main {

	public static void main(String[] args) {
		
		Company emp1 = new Company("Oracle");
		Company emp2 = new Company("IBM");
		Company emp3 = new Company("Red Hat");
		Company emp4 = new Company("Moura");
		
		Company deoo = new Company("DEOO TSI Softwares");
		
		
		emp1.addDev(new Developer("Ada Lovelace", 10000.0));
		emp1.addDev(new Developer("James Gosling", 10000.0));
		
		emp2.addDev(new Developer("Alan Turing", 2000.0));
		emp2.addDev(new Developer("Dennis Ritchie", 10000.1));
		
		emp3.addDev(new Developer("Linus Torvalds", 2345.21));
		emp3.addDev(emp4);
		
		emp4.addDev(new Developer("Ken Thompson", 5000.0));
		emp4.addDev(new Developer("Tim Berners-Lee", 8000.25));
		emp4.addDev(new Developer("Guido van Rossum", 500.0));
		
		deoo.addDev(emp1);
		deoo.addDev(emp2);
		deoo.addDev(emp3);
		//deoo.addDev(emp4);
		
		System.out.printf("Total Oracle: %.2f\n", emp1.getSalary());
		System.out.printf("Total IBM: %.2f\n", emp2.getSalary());
		System.out.printf("Total Red Hat: %.2f\n", emp3.getSalary());
		System.out.printf("Total Moura: %.2f\n", emp4.getSalary());
		System.out.printf("Total DEOO: %.2f\n", deoo.getSalary());
		
		
	}
	
}
