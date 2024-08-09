package br.edu.ednilsonrossi;

public interface StockObserver {

	void onStockChange(String skuCode, Long quantity);
	
}
