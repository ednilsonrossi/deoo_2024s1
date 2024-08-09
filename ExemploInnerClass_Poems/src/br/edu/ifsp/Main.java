package br.edu.ifsp;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Poema 1");
		Poem poem = new Poem();
		for(String str : poem) {
			System.out.println(str);
		}

		System.out.println("\nPoema 2");
		Poem2 poem2 = new Poem2();
		poem2.forEach(str -> System.out.println(str));
		
	}

}
