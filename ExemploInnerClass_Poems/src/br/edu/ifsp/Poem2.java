package br.edu.ifsp;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Poem2 implements Iterable<String>{
	private final List<String> verses = List.of(
		"No meio do caminho tinha uma pedra",
		"tinha uma pedra no meio do caminho",
		"tinha uma pedra",
		"no meio do caminho tinha uma pedra."
	);

	@Override
	public Iterator<String> iterator() {
		return new IteratorImpl();
	}
	
	private class IteratorImpl implements Iterator<String>{
		private int position;
		
		public IteratorImpl() { position = 0; }

		@Override
		public boolean hasNext() {
			return position < verses.size();
		}

		@Override
		public String next() {
			if (hasNext()) {
				position += 1;
				return verses.get(position - 1);
			} else {
				throw new NoSuchElementException();
			}
		}
	}
}
