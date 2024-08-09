package staticnestedclass;

public class Externa {
	private static int static_value = 2;
	private int value;

	public Externa(int value) {
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
		private String str;

		public Interna() {
			str = "Sou classe Interna, não tenho acesso ao value.";
		}
		
		public void show() {
			str += "\nPorém acesso os dados estáticos: ";
			str += static_value;
			System.out.println(str);
		}
	}
}
