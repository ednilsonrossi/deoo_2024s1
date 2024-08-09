package br.edu.ednilsonrossi;

import java.util.LinkedList;
import java.util.List;

public class ClientCode implements StockObserver{

	public static void main(String[] args) {
		new ClientCode().run();
	}

	@Override
	public void onStockChange(String skuCode, Long quantity) {
		System.out.println(String.format("Atualização: Produto %s - %d unidades", skuCode, quantity));
		
	}
	
	public void run() {
		List<String> lista = new LinkedList<String>();
		
		StockItem item = new StockItem("ASUS_X550", "Notebook Asus i7, 16GBm iTB", 5L);
		
		item.listener(this);
		item.listener(new StockObserver() {
			@Override
			public void onStockChange(String skuCode, Long quantity) {
				if (quantity < 4) {
					System.out.println("Alerta: Produto " + skuCode + " estoque baixo, somente " + quantity + " unidades");
				}
			}
		});
		
		item.listener(new StockObserver() {
			@Override
			public void onStockChange(String skuCode, Long quantity) {
				if (quantity > 10) {
					System.out.println("Alerta: Fazer promoção de " + skuCode);
				}
			}
		});
		
		item.listener(new Natan());
		item.listener(new StockObserver() {
			
			@Override
			public void onStockChange(String skuCode, Long quantity) {
				lista.add(skuCode);
				
			}
		});
		
		item.add(2L);
		item.remove(6L);
		item.add(12L);
		System.out.println(lista);
	}
	
}
