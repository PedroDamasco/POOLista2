public class Apolice {

	private int Numero, Idade;
  
	private String Nome;
  
	private char Sexo;
  
	private double BalorAutomovel;

	public Apolice() {
		
	}

	public Apolice(int Numero,String Nome, int Idade, char Sexo, double ValorAutomovel) {
		this.Numero = Numero;
    
		this.Nome = Nome;
    
		this.Idade = Idade;
    
		this.Sexo = Sexo;
    
		this.ValorAutomovel = ValorAutomovel;
    
	}

	public double calcularValor() {
		double result = 0;
    
		if (Sexo == 'm' && Idade <= 25) {
			result = valorAutomovel * (10 / 100);
      
		} else if (Sexo == 'm' && Idade > 25) {
			result = valorAutomovel * (5 / 100);
      
		} else {
			result = valorAutomovel * (2 / 100);
      
		}
		return result;
	}

	public String imprimir() {
		return "Número: " + Numero +
				"\nNome: " + Nome + 
				"\nIdade: " + Idade + 
				"\nSexo: " + Sexo + 
				"\nValor automóvel: "+ ValorAutomovel + 
				"\nValor Apólice: " + CalcularValor();
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char Sexo) {
		this.Sexo = Sexo;
	}

	public double getValorAutomovel() {
		return ValorAutomovel;
	}

	public void setValorAutomovel(double ValorAutomovel) {
		this.ValorAutomovel = ValorAutomovel;
	} }
