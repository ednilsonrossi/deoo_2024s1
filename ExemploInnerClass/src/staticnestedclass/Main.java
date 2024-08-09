package staticnestedclass;

public class Main {
	public static void main(String[] args) {
		Externa outer = new Externa(100);
		outer.print();
		
		/**
		 * Por ser estática, a instância da classe
		 * Interna é feita no escopo da Classe e 
		 * não do objeto.
		 */
		Externa.Interna nested = new Externa.Interna();
		nested.show();
		
		/**
		 * A Static Nested Class para ter acesso aos membros
		 * não estáticos precisa de uma instância para
		 * poder acessar os membros não estáticos. 
		 */
		Externa2.Interna nested2 = new Externa2.Interna(new Externa2(50));
		nested2.show();
	}
}
