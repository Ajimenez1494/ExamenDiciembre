package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestEj2 {

	public TestEj2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestEj2 eje2= new TestEj2();
    //leer todas las lineas del fichero
    String nombre="D:\\Workspace\\ExamenDiciembre\\src\\main\\java\\ejercicio2\\fichero\\FicheroEjercicio2.txt";		
	eje2.leerArchivo(nombre);
	}
	public String leerArchivo(String nombre) {
//		StringBuilder sb = new StringBuilder();
//		File archivo = new File(nombre);
//		try (Scanner s = new Scanner(archivo)) {
//
//			s.useDelimiter("\n");
//			while (s.hasNext()) {
//				sb.append(s.next()).append("\n");
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return sb.toString();
//	}
		
        try (BufferedReader leerTodo = new BufferedReader(new FileReader(nombre))) {
            String linea;
            
            while ((linea = leerTodo.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		return nombre;
}}
