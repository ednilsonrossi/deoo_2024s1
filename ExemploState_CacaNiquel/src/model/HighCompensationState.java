package model;

import java.util.Random;

public class HighCompensationState implements ICompensationState{

	private static HighCompensationState instance = null;
	
	private final int highBorder = 6;
	private Random random = new Random();
	
	private HighCompensationState() {
		
	}
	
	public static HighCompensationState getInstance() {
		if (instance == null) {
			instance = new HighCompensationState();
		}
		return instance;
	}
	
	@Override
	public void play(SlotMachine machine) {
		int draw = random.nextInt(FIBONACCI.get(highBorder));
		boolean win = false;
		
		if ( FIBONACCI.contains(draw) ) {
			win = true;
			machine.setCompensationTax(machine.getCompensationTax() * 0.9);
		} else {
			machine.setCompensationTax(machine.getCompensationTax() * 1.01);
		}
		if(machine.getCompensationTax() < 75.0) {
			machine.setState(ModerateCompensationState.getInstance());
			System.out.println("Passei para moderado!");
		}
		
		machine.setA(random.nextInt(machine.getSymbols().size()));
		if(win) {
			machine.setB(machine.getA());
			machine.setC(machine.getA());
		} else {
			machine.setB(machine.getA());
			machine.setC(random.nextInt(machine.getSymbols().size()));
		}
	}
	
	

}
