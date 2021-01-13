package dever1;

import br.com.softblue.commons.io.Console;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Nome  ");
		String nome = Console.readString();
		
		System.out.println("Peso  ");
		double peso = Console.readDouble();
		
		System.out.println("Idade  ");
		int idade = Console.readInt();
		
		System.out.println("Altura  ");
		double altura = Console.readDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Imc   = " + imc);
		
		
		
	}

}
