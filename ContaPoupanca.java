package br.com.apostila.caelum.exceptions;

public class ContaPoupanca extends Conta {
	
		
		//c�digo feito para exibir o tipo de conta da lista da tela inicial
	    //antes retornava apenas "return "Conta Poupanca""
		//usando "super" e "getTipo", basta escrever "Corrente" ou "Poupan�a", pois "Conta" j� vem da classe m�e
		public String getTipo() {
			return super.getTipo() + " Poupan�a";
		}
		
			
		@Override
		public boolean saca(double valor) {
			this.saldo -= valor;
			return true;
		}

}
