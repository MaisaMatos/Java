package br.com.apostila.caelum.exceptions;

import java.io.FileNotFoundException;

public class TesteLeituraTryCatch {
	
	public static void main(String[] args) {
		
		//o compilador sugere para fazer um "try-catch" ou um "throws". Faremos o "try-catch" primeiro.
		
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}
