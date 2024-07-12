package withProxy.model;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class FibonacciProxy implements IFibonacci {

	private Fibonacci realService;
	private Map<Integer, Long> memoization;
	

	public FibonacciProxy() {
		realService = new Fibonacci();
		memoization = new HashMap<Integer, Long>();
	}

	@Override
	public long getTermo(int posicao) throws NoSuchElementException {
		if(! memoization.containsKey(posicao)) {
			memoization.put(posicao, realService.getTermo(posicao));
			System.out.println("Usando realService: " + posicao);
		}
		
		return memoization.get(posicao);
	}

}
