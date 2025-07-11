package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ProcesaEntrada {
	
	
	public static String leerEntrada(Reader r) {
		
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(r)) {
			String linea;
			
			while((linea = br.readLine()) != null) {
				sb.append(linea + "\n");
			}
			
		}catch (IOException e) {
			//hacer un log
			throw new RuntimeException();
		}
		
		
		return sb.toString();
	}

}
