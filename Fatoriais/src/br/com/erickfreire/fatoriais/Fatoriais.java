package br.com.erickfreire.fatoriais;

/**
 * Programa em Java que calcula os fatoriais
 * @author Erick Freire
 * @version 1 - Criado em 19-04-2021 as 18:47
 */

public class Fatoriais {
	public static void main(String[] args) {
		
		int resultado = 1;	
		
		for(int i = 1; i <= 20; i++) {
			
			if(i > 1)
			resultado = resultado * (i - 1);
		}
		

		   System.out.printf("%nO Fatorial é de: %d", resultado);
		
	}

}
