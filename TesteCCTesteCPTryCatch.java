package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch {
	
	//podemos escolher vários lugares para colocar o try-catch
	//esta não é uma boa opção, pois a msg "Consegui Sacar" será impressa mesmo que o "catch" seja acionado.
	//sempre que há algo que depende da linha de código anterior para ser correto, devemos agrupa-lo no "try" (ver próximo)
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try {
			cc.saca(50);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Consegui sacar da Conta Corrente!");
		
		try {
			cp.saca(50);
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());			
		}
		System.out.println("Consegui sacar da Conta Poupança!");
	}
	
	
	
	

}
