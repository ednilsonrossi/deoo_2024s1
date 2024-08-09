package staticnestedclass;

public class Externa2 {
	private static int static_value = 2;
	private int value;

	public Externa2(int value) {
		this.value = value;
		static_value += value;
	}
	
	public void print() {
		System.out.println("Value: " + value);
	}
	
	/**
	 * Uma Static Nested Class não tem acesso aos membros
	 * de instância da classe Externa, é possível acessar 
	 * apenas os membros de classe, ou seja, os membros
	 * estáticos.
	 */
	public static class Interna{
		private Externa2 outer;
		private String str;

		public Interna(Externa2 outer) {
			this.outer = outer;
			str = "Sou classe Interna, minha instâncias de ";
			str += "Externa possui o value: " + this.outer.value;
		}
		
		public void show() {
			str += "\nPorém acesso os dados estáticos: ";
			str += static_value;
			System.out.println(str);
		}
	}
}
