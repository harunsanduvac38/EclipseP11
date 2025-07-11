package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	
	
	public static String muestraFichero(String fichero) {
		
		StringBuilder sb = new StringBuilder();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
