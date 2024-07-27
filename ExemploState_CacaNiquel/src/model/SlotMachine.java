package model;

import java.util.Arrays;
import java.util.List;

public class SlotMachine {
	
	private final List<String> symbols;
	private int a = 0;
	private int b = 0;
	private int c = 0;
	private double compensationTax = 100.0;
	private ICompensationState state;
	private int machineScore;
	private int playerScore;
	private int games;
	
	
	public SlotMachine() {
		this.symbols = Arrays.asList("Cereja", "Limão", "Laranja", "Ameixa", "Uva", "$");
		this.compensationTax = 100.0;
		state = HighCompensationState.getInstance();
		machineScore = 0;
		playerScore = 0;
		games = 0;
	}

	public void play() {
		state.play(this);
		games += 1;
		if(winner()) {
			playerScore += 1;
		} else {
			machineScore += 1;
		}
	}
	
	public String getDisplay(int position) {
		if(position < 1 || position > 3) {
			throw new IllegalArgumentException("Position out of Display");
		}
		switch (position) {
			case 1: return symbols.get(a);
			case 2: return symbols.get(b);
			case 3: return symbols.get(c);
			default: return "";
		}		
	}
	
	public String getDisplay() {
		String str =  String.format("| %s | %s | %s |\n", 
				symbols.get(a),
				symbols.get(b),
				symbols.get(c)
				);
		if(winner()) {
			str += "PARABÉNS!!! VENCEDOR";
		}
		str += getScoreboard();
		return str;
	}
	
	public boolean bigWinner() {
		return winner() && a == 5;
	}
	
	public boolean winner() {
		return a == b && a == c;
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getCompensationTax() {
		return compensationTax;
	}

	public void setCompensationTax(double compensationTax) {
		this.compensationTax = compensationTax;
	}

	public ICompensationState getState() {
		return state;
	}

	public void setState(ICompensationState state) {
		this.state = state;
	}

	public List<String> getSymbols() {
		return symbols;
	}
	
	private String getScoreboard() {
		return "\nPlayer: " + playerScore + " x Slot Machine: " + machineScore + " \t Total Games: " + games + " Casa: " + (machineScore * 100 / games ) + "%\n";
	}
}
