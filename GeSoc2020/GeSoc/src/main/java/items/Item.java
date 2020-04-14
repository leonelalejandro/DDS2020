package items;

public class Item {
	private double precio;
	private String detalle;

	public Item(double precio, String detalle) {
		this.precio = precio;
		this.detalle = detalle;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public String detalle() {
		return this.detalle;
	}

}
