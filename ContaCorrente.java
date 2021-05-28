package br.com.apostila.caelum.exceptions;

public class ContaCorrente extends Conta {
	
	private double taxaSaque = 0.10;
	
		//código feito para exibir o tipo de conta da lista da tela inicial
	    //antes retornava apenas "return "Conta Corrente""
		//usando "super" e "getTipo", basta escrever "Corrente" ou "Poupança", pois "Conta" já vem da classe mãe
		public String getTipo() {
			return super.getTipo() + " Corrente";
		}
		
		//aqui, reescrevemos o método saca para que os saques de Conta Corrente cobrem taxa de 0.10.		
		@Override
		public boolean saca(double valor) {
			this.saldo -= (valor + taxaSaque);
			return true;
		}

}
