package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService(); // INSTANCIA A CLASSE 
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M'); // OS 'SUM' RECEBE O RETURN DO METODO, USANDO A LISTA E O METODO PARA CADA P COM O TESTE DEFINIDO.
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	
		}
	}


