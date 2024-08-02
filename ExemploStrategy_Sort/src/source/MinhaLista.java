package source;

public class MinhaLista {

	private int valores[];
	private int topo;
	private IClassificacao strategy;
	
	public MinhaLista(IClassificacao strategy, int size) {
		this.strategy = strategy;
		valores = new int[size];
		topo = -1;
	}
	
	public MinhaLista(IClassificacao strategy, int... valores) {
		this.strategy = strategy;
		this.valores = valores;
		this.topo = this.valores.length;
	}
	
	public boolean add(int valor) {
		if (topo == valores.length)
			return false;
		
		topo += 1;
		valores[topo] = valor;
		return true;
	}
	
	public void classificar() {
		strategy.sort(valores);
	}
	
	public int[] getValores() {
		return valores;
	}
	
	public static void main(String[] args) {
		int[] dados = {10, 7, 15, 23, 8, 16, 42, 5, 9, 30}; 
		MinhaLista lista = new MinhaLista(new MergeSort(), dados);
		// MinhaLista lista = new MinhaLista(new InsertSort(), dados);
		lista.classificar();
		for(int i : lista.getValores()) {
			System.out.println("Valor: " + i);
		}
	}
}
