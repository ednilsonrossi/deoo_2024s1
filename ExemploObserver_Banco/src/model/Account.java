package model;

import java.util.LinkedList;
import java.util.List;

public final class Account implements Subject{
	private final long id;
	private double balance;
	private List<Observer> observers;
	
	public Account(long id) {
		this.id = id;
		balance = 0.0;
		observers = new LinkedList<Observer>();
	}
	
	@Override
	public void attach(Observer subscriber) {
		observers.add(subscriber);
	}

	@Override
	public void detach(Observer subscriber) {
		observers.remove(subscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer s : observers) {
			s.update(this);
		}
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

	public final void deposit(double value) {
		this.balance += value;
		notifyObservers();
	}
	
	public final boolean draft(double value) {
		if(balance >= value) {
			this.balance -= value;
			notifyObservers();
			return true;
		}
		return false;
	}

	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

}
