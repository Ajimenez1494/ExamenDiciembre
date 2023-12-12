package es.curso.java;

import java.util.Scanner;


public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Hola mundo" + args);
  Scanner scan = new Scanner(System.in); 
  String respuesta= scan.nextLine();
  scan.close();
 // logger.info("info");
	}

}
