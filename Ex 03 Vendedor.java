public class Vendedor {

	private int Codigo;
  
	private String Nome;
  
	private double PercentualComissao;

	public Vendedor() {
	}

	public Vendedor(int Codigo, String Nome, double PercentualComissao) {
		this.Codigo = Codigo;
    
		this.Nome = Nome;
    
		this.PercentualComissao = PercentualComissao;
	}

	public double CalcularPagamentoComissao(double ValorVenda) {
		return ValorVenda * (this.percentualComissao / 100);
	}

	public double calcularPagamentoComissao(double valorVenda, double desconto) {
    
		return calcularPagamentoComissao(valorVenda) - desconto;
	}

	public String imprimir(double valorVenda, double desconto){
		return 
      
				"Código: " + codigo +
				"\nNome: " + nome + 
				"\n% Comissao: " + percentualComissao + 
				"\nDesconto: " + desconto + 
				"\nValor a Pagar: "+ calcularPagamentoComissao(valorVenda, desconto);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

}
