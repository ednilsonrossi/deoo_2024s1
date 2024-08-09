package br.edu.ednilsonrossi.view;

import br.edu.ednilsonrossi.model.Product;
import br.edu.ednilsonrossi.model.*;

public class ECommerceApp {

	public static void main(String[] args) {
		Product phone = new Electronics("Smartphone", 699.99, "TechBrand", 24);
        Product shirt = new Clothing("T-Shirt", 19.99, "M", "Cotton");
        Product apple = new Food("Apple", 0.99, "2024-12-31");

        displayProductDetails(phone);
        displayProductDetails(shirt);
        displayProductDetails(apple);

	}
	
	public static void displayProductDetails(Product product) {
        System.out.println(product);
    }

}
