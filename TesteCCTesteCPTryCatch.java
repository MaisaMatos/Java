package br.com.apostila.caelum.exceptions;

public class TesteCCTesteCPTryCatch {
	
	//podemos escolher v�rios lugares para colocar o try-catch
	//esta n�o � uma boa op��o, pois a msg "Consegui Sacar" ser� impressa mesmo que o "catch" seja acionado.
	//sempre que h� algo que depende da linha de c�digo anterior para ser correto, devemos agrupa-lo no "try" (ver pr�ximo)
	
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
		System.out.println("Consegui sacar da Conta Poupan�a!");
	}
	
	
	
	

}
