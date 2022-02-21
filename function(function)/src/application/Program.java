package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Fridge", 3000.00));
		list.add(new Product("Tv", 800.00));
		list.add(new Product("Iphone", 4000.00));
		list.add(new Product("Mouse", 40.00));
		list.add(new Product("Tablet", 400.00));

		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum: " + String.format("%.2f", sum));
	}

}
