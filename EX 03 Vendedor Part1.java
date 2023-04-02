import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
		
		int a = 0;
    
		int Codigo;
    
		String Nome;
    
		double PercentualComissao, valorVenda, desconto;
		
		Vendedor v1 = new Vendedor();

		while (a != 3) {
			System.out.println("> Menu <");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 Cadastrar Vendedor");
			System.out.println("2 Calcular Comissão");
			System.out.println("3 Sair");
			a = sc.nextInt();

			switch (a) {
          
			case 1:
				System.out.println("Digite o codigo do vendedor: ");
				codigo = sc.nextInt();
				System.out.println("Digite o nome do vendedor: ");
				nome = sc.next();
				System.out.println("Digite o percentual da comissâo do vendedor: ");
				percentualComissao = sc.nextDouble();
				v1 = new Vendedor(codigo, nome, percentualComissao);
				break;
          
			case 2:
				System.out.println("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				System.out.println("Digite o valor do desconto: ");
				desconto = sc.nextDouble();
				System.out.println(v1.imprimir(valorVenda, desconto));
				break;
          
			case 3:
				System.out.println("Desligando");
				break;
          
			default: 
				System.out.println("Numero invalido, digite novamente: ");
				
			}		}	} }
