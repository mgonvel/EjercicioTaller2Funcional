package Ejercicio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Stream;

import Clase.Product;
import Enum.Tax;

public class EjercicioTaller2 {

	private static BigDecimal total = new BigDecimal("0");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		shoppingCart.stream().forEach((p) -> {
			total = total.add(p.getPrecio().add(p.getPrecio().multiply(p.getTasa().getPrecio())));

		});
		System.out.println("Total de la Compra: " + total.setScale(2, RoundingMode.HALF_UP) + " €");

		Stream<Product> productos = shoppingCart.stream().filter(producto -> producto.getNombre().startsWith("C"))
				.sorted();
		productos.forEach((p) -> {
			System.out.print(p.getNombre() + ", ");
		});
	}

}
