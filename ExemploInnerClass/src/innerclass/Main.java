package innerclass;

public class Main {
	public static void main(String[] args) {
		Externa outer = new Externa(10);
		outer.print();
		
		/**
		 * Não é possível instânciar uma classe Interna  de
		 * forma independente, isso porque a classe Interna
		 * é DEPENDENTE da classe Externa.
		 */
		// Interna inner = new Interna();
		
		/**
		 * Mesmo indicando a dependência entre as classes,
		 * a instância de uma classe Interna depende de 
		 * uma instância da classe Externa.
		 */
		// Externa.Interna inner = new Interna();
		
		/**
		 * A instância da classe Interna é feita com a 
		 * dependência do objeto da classe Externa.
		 */
		Externa.Interna inner = outer.new Interna();
		inner.show();
	}
}
