package model;

import java.util.Random;

public class LowCompensationState implements ICompensationState {

	private static LowCompensationState instance = null;
	
	private final int highBorder = 15;
	private Random random = new Random();
	
	public static LowCompensationState getInstance() {
		if (instance == null) {
			instance = new LowCompensationState();
		}
		return instance;
	}
	
	private LowCompensationState() {
		
	}

	@Override
	public void play(SlotMachine machine) {
		int draw = random.nextInt(FIBONACCI.get(highBorder));
		boolean win = false;
		
		if ( FIBONACCI.contains(draw) && !machine.winner() ) {
			win = true;
			machine.setCompensationTax(machine.getCompensationTax() * 0.7);
		} else {
			machine.setCompensationTax(machine.getCompensationTax() * 1.001);
		}
		if(machine.getCompensationTax() > 55.0) {
			machine.setState(ModerateCompensationState.getInstance());
			System.out.println("Passei para moderado!");
		} 
		
		machine.setA(random.nextInt(machine.getSymbols().size()));
		if(win) {
			machine.setB(machine.getA());
			machine.setC(machine.getA());
		} else {
			machine.setB(random.nextInt(machine.getSymbols().size()));
			machine.setC(random.nextInt(machine.getSymbols().size()));
		}
	}

}
