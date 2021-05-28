package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch3 {
	
	//podemos escolher vários lugares para colocar o try-catch
	//nesta opção, imaginamos que, para o nosso sistema, uma falha ao sacar da cp deve parar o processo de saques e nem
	//tentar sacar da cp. Então, agrupamos mais ainda.
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da Conta Corrente!");
			cp.saca(50);
			System.out.println("Consegui sacar da Conta Poupança!");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
		
		
		
	
	
	
	

