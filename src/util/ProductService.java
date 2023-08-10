package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) { // O METODO USA A LISTA E O PREDICADO COMO ARGUMENTO 
		double sum = 0.0;
		for (Product p: list) {  // PRA CADA PRODO P NA LISTA
			if (criteria.test(p)) { // O METODO FAZ O TESTE DEFINIDO NO PROGRAMA PRINCIPAL, EM CADA P DA LISTA QUE FOR CHAMADO
				sum += p.getPrice(); // SE POSITIVO, SOMA
			}
		}
		return sum;
	}
}
