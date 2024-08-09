package br.edu.ednilsonrossi;

public class Natan implements StockObserver{

	@Override
	public void onStockChange(String skuCode, Long quantity) {
		
		if (quantity < 10) {
			System.out.println("Natan diz que precisa comprar " + skuCode);
		}
		
	}
	
	

}
