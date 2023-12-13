package es.curso.java;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HolaMundo {

	private final static Logger log = LogManager.getLogger(HolaMundo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Hola mundo" + args);
  Scanner scan = new Scanner(System.in); 
  String respuesta= scan.nextLine();
  scan.close();
   log.info("info");
	}

}
