package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	
	public static void main(String[] args) {
		String fichero = "/Users/mananas/ContactoDaoMem.java";
		
//		System.out.println(muestraFichero(fichero));
		
		System.out.println(leerFichero(fichero));
	}
	
	
	
	public static String leerFichero(String fichero) {
		StringBuilder sb = new StringBuilder();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {  //Java automaticamente cierra br, no hace falta escribir la parte finally para cerrarlo
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return sb.toString();
		
	}
	

	
	public static String muestraFichero(String fichero) {
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				sb.append(linea + "\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return sb.toString();
	}

}
