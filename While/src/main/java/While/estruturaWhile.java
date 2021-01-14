package While;

import br.com.softblue.commons.io.Console;

public class estruturaWhile {

	public static void main(String[] args) {
		
		double nota;
		int cont = 1;
        double soma = 0;
        int cont2 = 0;
        
        do {
            System.out.println("Digite a Nota " + cont++ + ":");
            nota = Console.readDouble();
            
            
            if (nota != -1) {
            	cont2++;
            	soma += nota;
            	System.out.println("(soma = " + soma + ")");
            }
            
        } while (nota != -1);
        
        double media = soma / cont2;
        System.out.println("Media " + media);
        System.out.println("Media " + cont2);
	}

}
