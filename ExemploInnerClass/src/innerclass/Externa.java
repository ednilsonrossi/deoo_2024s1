package innerclass;

public class Externa {

	private int value;

	public Externa(int value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println("Value: " + value);
	}
	
	public class Interna{
		private String str;

		public Interna() {
			str = "Sou classe Interna, o value é: " + value;
		}
		
		public void show() {
			System.out.println(str);
		}
	}

}
