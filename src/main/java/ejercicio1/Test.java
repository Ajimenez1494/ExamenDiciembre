package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.iniciaPrograma();
	}

	public void iniciaPrograma() {
		// Crear 3 master y añadirlos al mapa
		Master master1 = new Master("Master1", 1, 10, true);
		Master master2 = new Master("Master2", 2, 15, true);
		Master master3 = new Master("Master3", 3, 25, false);
		
		Map<String, Master> MapaMaster = new HashMap<>();
		MapaMaster.put("1", master1);
		MapaMaster.put("2", master2);
		MapaMaster.put("3", master3);
		
		//Eliminar un master del mapa por su codigo
		String codMaster="1";
		MapaMaster.remove(codMaster);
        //Mostrar nombres de todos los master disponibles
		 for (Master master : MapaMaster.values()) {
	            System.out.println(master.obtenerNomCurso());
	        }

	          
}}
