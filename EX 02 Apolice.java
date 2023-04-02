import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int Numero, Idade;
		String Nome;
		char Sexo;
		double ValorAutomovel;
		Apolice apolice = new Apolice();

		while (a != 3) {
			System.out.println("> Menu <");
      
			System.out.println("Digite o numero para selecionar");
      
			System.out.println("1 - Criar Apólice");
      
			System.out.println("2 - Ver dados Apólice");
      
			System.out.println("3 - Sair");
      
			a = sc.nextInt();

			switch (a) {
			case 1:
          
				System.out.println("Digite seu numero: ");
				Numero = sc.nextInt();
          
				System.out.println("Digite seu Nome: ");
				Nome = sc.next();
          
				System.out.println("Digite a sua idade: ");
				Idade = sc.nextInt();
          
				System.out.println("Digite o seu sexo: ");
				Sexo = sc.next().charAt(0);
          
				System.out.println("Digite o valor do seu automóvel: ");
				ValorAutomovel = sc.nextDouble();
          
				Apolice = new Apolice(Numero, Nome, Idade, Sexo, ValorAutomovel);
				break;
          
			case 2:
				System.out.println(Apolice.imprimir());
				break;
          
			case 3:
				System.out.println("Adeus");
				break;
          
			default: 
				System.out.println("Numero invalido, digite novamente: ");
			}		}	}}
