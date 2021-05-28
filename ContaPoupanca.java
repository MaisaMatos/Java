package br.com.apostila.caelum.exceptions;

public class ContaPoupanca extends Conta {
	
		
		//código feito para exibir o tipo de conta da lista da tela inicial
	    //antes retornava apenas "return "Conta Poupanca""
		//usando "super" e "getTipo", basta escrever "Corrente" ou "Poupança", pois "Conta" já vem da classe mãe
		public String getTipo() {
			return super.getTipo() + " Poupança";
		}
		
			
		@Override
		public boolean saca(double valor) {
			this.saldo -= valor;
			return true;
		}

}
