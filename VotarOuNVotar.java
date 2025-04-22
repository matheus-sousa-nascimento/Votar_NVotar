/*
 * VotarOuNVotar.java
 * 
 * 
 * 
 * 
 */

import java.util.Calendar;
import java.util.Scanner;

public class VotarOuNVotar {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Calendar hoje = Calendar.getInstance();
		
		int anoNasc = 0;
		int voto = 0;
		int ano = hoje.get(Calendar.YEAR);
		
		System.out.print("Digite o seu ano de nascimento ");
		anoNasc = entrada.nextInt();
		
		voto = ano - anoNasc;
		
		String res = ( voto >= 18? "Voce pode votar" : "Nao pode votar!!!");
		
		System.out.println(res);
	}
}

