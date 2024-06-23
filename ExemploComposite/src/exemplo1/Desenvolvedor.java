package exemplo1;

public class Desenvolvedor {

	private final String nome;
	private final Double salario;
	private final Empresa empresa;
	
	public Desenvolvedor(String nome, Double salario, Empresa empresa) {
		this.nome = nome;
		this.salario = salario;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
}
