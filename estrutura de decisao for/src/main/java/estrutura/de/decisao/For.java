package estrutura.de.decisao;


import br.com.softblue.commons.io.Console;

public class For {

	public static void main(String[] args) {
		
					
		System.out.println("Nome  ");
		String nome = Console.readString();
		
		System.out.println("Peso  ");
		double peso = Console.readDouble();
		
		System.out.println("Idade  ");
		int idade = Console.readInt();
		
		System.out.println("Altura  ");
		double altura = Console.readDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Imc = " + imc);
		
		
		if (imc >= 35) 
		System.out.println("Precisa de Cirurgia! ");	
		
		
		else 
	    System.out.println("N�o precisa de cirurgia! ");
		
		System.out.println(" ***FIM DO PROGRAMA *** ");
		
		
		
        
		
		
		
	}

}
