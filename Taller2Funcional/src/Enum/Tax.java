package Enum;

import java.math.BigDecimal;

public enum Tax {

	NORMAL(new BigDecimal("0.21")), SUPERREDUCED(new BigDecimal("0.04")), REDUCED(new BigDecimal("0.1"));

	public java.math.BigDecimal precio;

	Tax(java.math.BigDecimal precio) {
		this.precio = precio;
	}

	public java.math.BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(java.math.BigDecimal precio) {
		this.precio = precio;
	}

}
