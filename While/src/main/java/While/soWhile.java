package While;

import br.com.softblue.commons.io.Console;

public class soWhile {

	public static void main(String[] args) {
		
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		while (true) {
			System.out.println("Digite a Nota " + cont + ":");
			nota = Console.readDouble();
			
			
			if (nota == -1 ) {
			    break;	
			}
			
			cont++;
			soma += nota;
			System.out.println("(soma = " + soma + ")");
		}
        
		double media = soma / cont;
		System.out.println("Media " + media);
	}

}
