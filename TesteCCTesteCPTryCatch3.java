package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch3 {
	
	//podemos escolher v�rios lugares para colocar o try-catch
	//nesta op��o, imaginamos que, para o nosso sistema, uma falha ao sacar da cp deve parar o processo de saques e nem
	//tentar sacar da cp. Ent�o, agrupamos mais ainda.
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da Conta Corrente!");
			cp.saca(50);
			System.out.println("Consegui sacar da Conta Poupan�a!");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
		
		
		
	
	
	
	

