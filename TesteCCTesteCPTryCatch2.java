package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch2 {
	
	//podemos escolher v�rios lugares para colocar o try-catch
	//sempre que h� algo que depende da linha de c�digo anterior para ser correto, devemos agrupa-lo no "try"
	
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
			System.out.println("Consegui sacar da Conta Poupan�a!");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	

}
