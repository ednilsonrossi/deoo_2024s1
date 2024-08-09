package br.edu.ednilsonrossi;

import java.util.LinkedList;
import java.util.List;

public final class StockItem implements StockSubject{
	private final String skucode;				// Stock Keeping Unit
	private final String name;
	private Long quantity;
	private List<StockObserver> listeners;
	
	public StockItem(String skucode, String name, Long quantity) {
		this.skucode = skucode;
		this.name = name;
		this.quantity = quantity >= 0 ? quantity : 0;
		listeners = new LinkedList<StockObserver>();
	}

	@Override
	public void listener(StockObserver listener) {
		if (listener != null) {
			listeners.add(listener);
		}	
	}

	@Override
	public void notifyListener() {
		for(var listener : listeners) {
			listener.onStockChange(skucode, quantity);
		}
	}
	
	public boolean remove(Long quantity) {
		if (this.quantity >= quantity) {
			this.quantity -= quantity;
			notifyListener();
			return true;
		}
		return false;
	}
	
	public void add(Long quantity) {
		if (quantity > 0) {
			this.quantity += quantity;
			notifyListener();
		}
	}

	public String getSkucode() {
		return skucode;
	}

	public String getName() {
		return name;
	}

	public Long getQuantity() {
		return quantity;
	}

}
