package br.com.apostila.caelum.exceptions;

import java.io.FileNotFoundException;

public class TesteLeituraThrows {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//o compilador sugere para fazer um "try-catch" ou um "throws". Agora faremos o "throws".
		
		new java.io.FileInputStream("arquivo.txt");
				
	}

}
