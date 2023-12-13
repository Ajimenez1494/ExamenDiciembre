package ejercicio3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ejercicio3.entities.Productos;



public class ProductosDao extends ConexionDao {

private static final Logger logger = LogManager.getLogger(ProductosDao.class);
	

	public ProductosDao() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Productos> getProductos () throws SQLException {
		
		List<Productos> Productos = new ArrayList<Productos>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT producto.id, producto.nom_producto, \r\n"
				+ "producto.tipo_producto, producto.precio, producto.Stock\r\n"
				+ "FROM TB_PRODUCTOS as producto \r\n";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long id = rs.getLong("producto.id");
			String nomProducto = rs.getString("producto.nom_producto");
			String tipo_Productos = rs.getString("producto.tipo_producto");
			int Stock = rs.getInt("producto.Stock");			
			int precio = rs.getInt("producto.precio");

			Productos producto = new Productos(precio, tipo_Productos, id, precio);
			
			Productos.add(producto);
		}
		
		return Productos;
	}
	

	
	
	public Productos getProductos (int id) {
		
		
		return null;
	}
	
	
	
	
	public int insertarProductos(Productos producto) throws SQLException {
		logger.debug("insertarProducto "+producto);

		String query = "INSERT "
				+ "INTO TB_PRODUCTOS (id,nom_producto,tipo_producto,precio,Stock ) "
				+ "VALUES (?,?,?,?,?)";
		
		logger.debug("query: "+query);
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setInt(1,producto.getId());
		ps.setString(2,producto.getNom_producto());
		ps.setString(3,producto.getTipo_producto());
		ps.setDouble(4,producto.getPrecio());
		ps.setInt(5,producto.getStock());

		
		int insertados = ps.executeUpdate();
		logger.debug("Productos insertados "+insertados);
		
		return insertados;
	}
}


