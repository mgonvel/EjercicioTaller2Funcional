package Clase;

import java.math.BigDecimal;

import Enum.Tax;

public class Product implements Comparable<Product> {
	public String nombre;
	public BigDecimal precio;
	public Tax tasa;

	public Product(String nombre, BigDecimal precio, Tax tasa) {
		this.nombre = nombre;
		this.precio = precio;
		this.tasa = tasa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Tax getTasa() {
		return tasa;
	}

	public void setTasa(Tax tasa) {
		this.tasa = tasa;
	}

	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

}
