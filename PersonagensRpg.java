package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class PersonagensRpg {

	private String[] personagens = {"Armin", "Enjin", "Yrva"};
	private int poder ;
	private int vida ;
	private int personagemEscolhido;
	
	
	Scanner sc = new Scanner(System.in);

	
	public void escolhaPersonagem() {
		int opcoes = 0;
		
		System.out.println("Escolha um dos personagens para configurar"); 
		System.out.println("[ 1 ]- Armin  [ 2 ]- Enjin  [ 3 ]- Yrva");
		while(true) {
			if(sc.hasNextInt())
		opcoes = sc.nextInt();
			 if(opcoes < 1 || opcoes > 3) {
				 System.out.println("Por favor digite um número entre 1 - 3");
			 }else {
			personagemEscolhido= opcoes - 1;
			System.out.println("Personagem escolhido>> " + (personagens[personagemEscolhido]));
			 }
		  }
		}
	
	public int getPoder() {
		return poder;
	}

	public void setPoder() {
		int poderEscolhido;
		System.out.println("Quantidade de poder de" + (personagens[personagemEscolhido]));
		poderEscolhido = sc.nextInt();
		if(poderEscolhido < 1 || poderEscolhido > 100){
			System.out.println("O poder precisa estar entre 1 e 0");
		}else {
		this.poder = poderEscolhido;
		}
		
		
	}
//
//	public int getVida() {
//		return vida;
//	}

//	public void setVida() {
//		this.vida = vida;
//		System.out.println("Quantidade de vida" + (personagens[personagemEscolhido]));
//		
//	}

	
	
}
