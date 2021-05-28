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

		//notar que ao invés de "boolean" que retorna V ou F, retornaremos uma exceção em caso de erros.
		//mas é uma exceção bem genérica, que não especifica o erro
		//RuntimeException é tipo unchecked
		public void saca(double valor) {
			if (this.saldo < valor) {
				throw new RuntimeException();
			} else {
				this.saldo -= valor;				
			}
		}
	
		//notar que o método "transfere" chama o método saca, então não é preciso "if"
		//notar que "destino" é uma "Conta", então pode chamar os métodos
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
