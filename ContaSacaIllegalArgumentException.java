package br.com.apostila.caelum.exceptions;

public class ContaSacaIllegalArgumentException {

	protected double saldo;
	private String titular;
	private String agencia;
	private int numero;
	protected String tipo;
	
		public void deposita(double valor) {
			this.saldo += valor;
		}

		//notar que ao invés de "boolean" que retorna V ou F, retornaremos uma exceção em caso de erros.
		//IllegalArgumentException diz mais que RuntimeException: que foi passado um argumento e seu método não gostou.
		//ela é unchecked porque estende RuntimeException
		//faz parte da biblioteca Java e é a melhor escolha quando um argumento é sempre inválido (numeros negativos, ref nulas)
		public void saca(double valor) {
			if (this.saldo < valor) {
				throw new IllegalArgumentException("Saldo insuficiente.");
			} else {
				this.saldo -= valor;				
			}
		}
	
		//notar que o método "transfere" chama o método saca, então não é preciso "if"
		//notar que "destino" é uma "Conta", então pode chamar os métodos
		public void transfere(double valor, ContaSacaIllegalArgumentException destino) {
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
