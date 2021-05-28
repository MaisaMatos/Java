package br.com.apostila.caelum.exceptions;

public class ContaSacaRuntimeException {

	protected double saldo;
	private String titular;
	private String agencia;
	private int numero;
	protected String tipo;
	
		public void deposita(double valor) {
			this.saldo += valor;
		}

		//notar que ao inv�s de "boolean" que retorna V ou F, retornaremos uma exce��o em caso de erros.
		//mas � uma exce��o bem gen�rica, que n�o especifica o erro
		//RuntimeException � tipo unchecked
		public void saca(double valor) {
			if (this.saldo < valor) {
				throw new RuntimeException();
			} else {
				this.saldo -= valor;				
			}
		}
	
		//notar que o m�todo "transfere" chama o m�todo saca, ent�o n�o � preciso "if"
		//notar que "destino" � uma "Conta", ent�o pode chamar os m�todos
		public void transfere(double valor, ContaSacaRuntimeException destino) {
			this.saca(valor);
			destino.deposita(valor);		
		}

		public double getSaldo() {
			return this.saldo;
		}
	
		public String getTitular() {
			return this.titular;
		}
	
		public void setTitular(String titular) {
			this.titular = titular;
		}
	
		public int getNumero() {
			return this.numero;
		}
	
		public void setNumero(int numero) {
			this.numero = numero;
		}
	
		public String getAgencia() {
			return this.agencia;
		}
	
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		
		public String getTipo() {
			return "Conta";
		}
}
