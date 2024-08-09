package br.edu.ifsp;

import java.util.Iterator;
import java.util.List;

public class Poem implements Iterable<String>{

	private final List<String> verses = List.of(
		"No meio do caminho tinha uma pedra",
		"tinha uma pedra no meio do caminho",
		"tinha uma pedra",
		"no meio do caminho tinha uma pedra."
	);

	@Override
	public Iterator<String> iterator() {
		return verses.iterator();
	}
	
}
