package dever1;

import br.com.softblue.commons.io.Console;

public class Atividade2 {

	public static void main(String[] args) {
		
		System.out.println("Nota 1: ");
		double nota1 = Console.readDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = Console.readDouble();

		System.out.println("Nota 3: ");
		double nota3 = Console.readDouble();

		System.out.println("Nota 4: ");
		double nota4 = Console.readDouble();
		
		double media = ( nota1 + nota2 + nota3 + nota4 )/ 4; 
		System.out.println("Media Final: " + media);
		
		if(media >= 5) {
		System.out.println("Passado!! ");
		
		}
	    else { 
	    System.out.println("Reprovado!! ");
	    }
		
	}

}
