package exemplo1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("Oracle");
		Empresa emp2 = new Empresa("IBM");
		Empresa emp3 = new Empresa("Red Hat");
		Empresa emp4 = new Empresa("Moura");
		
		
		List<Desenvolvedor> desenvolvedores = List.of(
				new Desenvolvedor("Ada Lovelace", 10000.0, emp1), 
				new Desenvolvedor("Alan Turing", 2000.0, emp2),
				new Desenvolvedor("Linus Torvalds", 2345.21, emp3),
				new Desenvolvedor("James Gosling", 10000.0, emp1),
				new Desenvolvedor("Dennis Ritchie", 10000.1, emp2),
				new Desenvolvedor("Ken Thompson", 5000.0, emp4),
				new Desenvolvedor("Tim Berners-Lee", 8000.25, emp4),
				new Desenvolvedor("Guido van Rossum", 500.0, emp4)
		);
		
		double oracle = 0.0;
		double ibm = 0.0;
		double redhat = 0.0;
		double moura = 0.0;
		
		for(Desenvolvedor dev : desenvolvedores) {
			if( dev.getEmpresa() == emp1 ) {
				oracle += dev.getSalario();
			} else if ( dev.getEmpresa() == emp2 ) {
				ibm += dev.getSalario();
			} else if ( dev.getEmpresa() == emp3 ) {
				redhat += dev.getSalario();
			} else if ( dev.getEmpresa() == emp4 ) {
				moura += dev.getSalario();
			}
		}
		
		System.out.printf("Total Oracle: %.2f\n", oracle);
		System.out.printf("Total IBM: %.2f\n", ibm);
		System.out.printf("Total Red Hat: %.2f\n", redhat);
		System.out.printf("Total Moura: %.2f\n", moura);
		System.out.printf("Total da Folha: %.2f\n", oracle + ibm + redhat + moura);
	}
	
}
