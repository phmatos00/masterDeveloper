package operadores.relacionais.logicos;

import br.com.softblue.commons.io.Console;

public class RelacionaiseLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Numero 1: ");
		int n1 = Console.readInt();
		
		System.out.println("Numero 2: ");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2;
		System.out.println("Iguais ? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("São diferentes ? " + diferente);
		
		boolean maior = n1 > n2;
		System.out.println("É maior ? " + maior);
		
		boolean maiorigual = n1 >= n2;
		System.out.println("É maior ou igual ? " + maiorigual);
		
		
		
	}

}
