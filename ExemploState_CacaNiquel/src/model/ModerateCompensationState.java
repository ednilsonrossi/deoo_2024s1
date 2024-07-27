package model;

import java.util.Random;

public class ModerateCompensationState implements ICompensationState {

	private static ModerateCompensationState instance = null;
	
	private final int highBorder = 8;
	private Random random = new Random();
	
	public static ModerateCompensationState getInstance() {
		if (instance == null) {
			instance = new ModerateCompensationState();
		}
		return instance;
	}
	
	private ModerateCompensationState() {
		
	}

	@Override
	public void play(SlotMachine machine) {
		int draw = random.nextInt(FIBONACCI.get(highBorder));
		boolean win = false;
		
		if ( FIBONACCI.contains(draw) && !machine.winner() ) {
			win = true;
			machine.setCompensationTax(machine.getCompensationTax() * 0.8);
		} else {
			machine.setCompensationTax(machine.getCompensationTax() * 1.01);
		}
		if(machine.getCompensationTax() < 50.0) {
			machine.setState(LowCompensationState.getInstance());
			System.out.println("Passei para baixo!");
		} 
		if(machine.getCompensationTax() > 80.0) {
			machine.setState(HighCompensationState.getInstance());
			System.out.println("Passei para alto!");
		}
		
		machine.setA(random.nextInt(machine.getSymbols().size()));
		if(win) {
			machine.setB(machine.getA());
			machine.setC(machine.getA());
		} else {
			machine.setC(machine.getA());
			machine.setB(random.nextInt(machine.getSymbols().size()));
		}
	}

}
