package ejercicio3.entities;

public class Productos {

	private int id  ;
	private String nom_producto ;
	private String tipo_producto  ;
	private double precio ;
	private int stock ;
	
	
	public Productos(int id, String nom_producto, String tipo_producto, double precio, int stock) {
		super();
		this.id = id;
		this.nom_producto = nom_producto;
		this.tipo_producto = tipo_producto;
		this.precio = precio;
		this.stock = stock;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public Productos(int id, String nom_producto, double precio, int stock) {
		super();
		this.id = id;
		this.nom_producto = nom_producto;
		this.precio = precio;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_producto() {
		return nom_producto;
	}
	public void setNom_producto(String nom_producto) {
		this.nom_producto = nom_producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Productos [id=" + id + ", nom_producto=" + nom_producto + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	public String getTipo_producto() {
		// TODO Auto-generated method stub
		return tipo_producto;
	}
	

}
