package aula03;

import java.util.*;

public class PersonagensRpg {

private String nome;
	private String[] classe = {"Guerreiro", "Elfo", "Bruxa"};
	private int poder ;
	private int vida ;
	private int personagemEscolhido;
	
	
	Scanner sc = new Scanner(System.in);

	public String getNome() {
		return nome;
	}
	public void setNome() {
		System.out.println("Escolha um nome para seu personagem:");
		this.nome = sc.nextLine();
		}
		
	public void escolhaClasse() {
		int opcoes = 0;
		System.out.println("Escolha a classe do seu personagem"); 
		System.out.println("[ 1 ]- Guerreiro  [ 2 ]- Elfo  [ 3 ]- Bruxa");
		
	do {
		opcoes = sc.nextInt();
			 if(opcoes < 1 || opcoes > 3) {
				 System.out.println("Por favor digite um número entre 1 - 3");
			 }else {
			personagemEscolhido= opcoes - 1;
			System.out.println("Classe escolhida>> " + (classe[personagemEscolhido]));
			 }
		  }while(opcoes < 1 || opcoes > 3);
		}
	public int getPoder() {
		return poder;
	}

	public void setPoder() {
		int poderEscolhido;
		do {
		System.out.println("Quantidade de poder para o(a) " + (classe[personagemEscolhido]) + " " + nome + ": ");
		poderEscolhido = sc.nextInt();
		if(poderEscolhido < 1 || poderEscolhido > 100){
			System.out.println("O poder precisa estar entre 1 e 100");
		}else {
		this.poder = poderEscolhido;
			}
		}while( poderEscolhido < 1 || poderEscolhido > 100 );
	}

	public int getVida() {
		return vida;
	}

	public void setVida() {
		int qntVida = 0;
		do {
		System.out.println("Quantidade de vida:");
		
		if(qntVida < 1 || qntVida > 100){
			System.out.println("O poder precisa estar entre 1 e 100");
		qntVida = sc.nextInt();}
		}
		while(qntVida < 1 || qntVida > 100);
		this.vida = qntVida;
	}

	public void personagemFinal() {
		System.out.printf(">> Personagem Criado!\nNome: %s%nClasse: " + classe[personagemEscolhido] +  " \nPoder:%d%nVida:%d%n",nome,poder,vida);
	}
	
	
}
