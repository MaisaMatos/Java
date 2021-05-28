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

		//notar que ao inv�s de "boolean" que retorna V ou F, retornaremos uma exce��o em caso de erros.
		//IllegalArgumentException diz mais que RuntimeException: que foi passado um argumento e seu m�todo n�o gostou.
		//ela � unchecked porque estende RuntimeException
		//faz parte da biblioteca Java e � a melhor escolha quando um argumento � sempre inv�lido (numeros negativos, ref nulas)
		public void saca(double valor) {
			if (this.saldo < valor) {
				throw new IllegalArgumentException("Saldo insuficiente.");
			} else {
				this.saldo -= valor;				
			}
		}
	
		//notar que o m�todo "transfere" chama o m�todo saca, ent�o n�o � preciso "if"
		//notar que "destino" � uma "Conta", ent�o pode chamar os m�todos
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
