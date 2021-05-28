package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch2 {
	
	//podemos escolher vários lugares para colocar o try-catch
	//sempre que há algo que depende da linha de código anterior para ser correto, devemos agrupa-lo no "try"
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da Conta Corrente!");
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		
		try {
			cp.saca(50);
			System.out.println("Consegui sacar da Conta Poupança!");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	

}
