package withProxy.model;

import java.util.NoSuchElementException;

public class Fibonacci implements IFibonacci{
	
	@Override
	public long getTermo(int posicao) throws NoSuchElementException {
		if(posicao < 1) {
			throw new NoSuchElementException("The position [" + posicao + "] is invalid in Fibonacci Sequence.");
		}	
		return getFibonacciTerm(posicao);
	}
	
	private long getFibonacciTerm(int position) {
		if(position == 1) {
			return 0;
		}
		if(position == 2) {
			return 1;
		}
		return getFibonacciTerm(position - 1) + getFibonacciTerm(position - 2); 
	}
}
