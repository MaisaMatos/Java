package br.com.apostila.caelum.exceptions;

public class TesteErroTryCatchNaChamadaMetodo2 {

	public static void main(String[] args) {
		
		System.out.println("In�cio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	static void metodo1() {
		System.out.println("In�cio do m�todo1");
		try {
			metodo2();
		} catch(NullPointerException e) {
		System.out.println("erro: " + e);
		}
		System.out.println("Fim do m�todo1");
	}
	
	static void metodo2() {
		System.out.println("In�cio do m�todo2");
		ContaCorrente cc = new ContaCorrente();
			for(int i = 0; i <= 15; i++) {				
					cc.deposita(i + 1000);
					System.out.println(cc.getSaldo());
					if(i==5) {
						cc = null;
				}			
			//System.out.println("Fim do m�todo2");
		}
	}
	
}
