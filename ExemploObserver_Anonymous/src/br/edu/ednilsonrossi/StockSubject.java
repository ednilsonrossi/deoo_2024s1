package br.edu.ednilsonrossi;

public interface StockSubject {

	void listener(StockObserver listener);
	
	void notifyListener();
	
}
