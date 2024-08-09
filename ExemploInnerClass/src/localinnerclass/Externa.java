package localinnerclass;

public class Externa {
	private int value;

	public Externa(int value) {
		this.value = value;
	}
	
	public void print() {
		/**
		 * A classe LocalInterna existe no contexto do
		 * método print() e é definida a cada chamada
		 * do método.
		 */
		class LocalInterna{
			public int method() {
				int fat = 1;
				for(int i = 2; i <= value; i++) {
					fat *= i;
				}
				return fat;
			}
		}

		/**
		 * Para usar a classe local é preciso instânciar
		 * um objeto desta classe.
		 */
		LocalInterna lic = new LocalInterna();
		System.out.println("Value: " + lic.method());
	}
}
