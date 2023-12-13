package ejercicio3;

import java.sql.SQLException;

import ejercicio3.dao.ProductosDao;
import ejercicio3.entities.Productos;

public class Main {

	public static void main(String[] args) throws SQLException {
    ProductosDao pr= new ProductosDao();
		
	Productos producto1 = new Productos(1, "Producto1", "Alimentacion", 5, 10);
     Productos producto2 = new Productos(2, "Producto2", "Alimentacion", 8, 15);
     Productos producto3 = new Productos(3, "Producto3", "Electronica", 20, 5);
     Productos producto4 = new Productos(4, "Producto4", "Electronica", 50, 6);
     Productos producto5 = new Productos(5, "Producto5", "Ropa", 10, 8);
     Productos producto6 = new Productos(6, "Producto6", "Ropa", 12, 6);

		
		pr.insertarProductos(producto1);
		pr.insertarProductos(producto2);
		pr.insertarProductos(producto3);
		pr.insertarProductos(producto4);
		pr.insertarProductos(producto5);
		pr.insertarProductos(producto6);
		
	
	}

}
