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

	public double CalcularPagamentoComissao(double ValorVenda, double desconto) {
		return CalcularPagamentoComissao(valorVenda) - desconto;
	}

	public String imprimir(double ValorVenda, double Desconto){
		return 
				"Código: " + Codigo +
				"\nNome: " + Nome + 
				"\n% Comissao: " + PercentualComissao + 
				"\nDesconto: " + Desconto + 
				"\nValor a Pagar: "+ CalcularPagamentoComissao(ValorVenda, desconto);
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		this.Codigo = Codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = Nome;
	}

	public double getPercentualComissao() {
		return PercentualComissao;
	}

	public void setPercentualComissao(double PercentualComissao) {
		this.PercentualComissao = PercentualComissao;
	}

}
