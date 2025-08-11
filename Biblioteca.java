package aula03;

import java.util.Scanner;

	 public class Biblioteca {
	 private String nomeLivro;
	 private String nomeAutor;
	 private int numPaginas;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 public String getNomeLivro() {
		return nomeLivro;
	 }
	 public void setNomeLivro() {
		 System.out.println("Informe o nome do livro:");
		 while(true) {
		this.nomeLivro = sc.nextLine();
		if(nomeLivro.matches("[a-zA-Z]+")) {
			break;
		}else {
			System.out.println("Nome do livro inválido! Digite apenas letras.");
		}
			}
		 
	 }
	 public String getNomeAutor() {
		return nomeAutor;
	 }
	 public void setNomeAutor() {
		 System.out.println("Informe o nome do Autor:");
		 while(true) {
			this.nomeAutor = sc.nextLine();
			if(nomeAutor.matches("[a-zA-Z]")) {
				System.out.println("Nome do autor inválido! Digite apenas letras.");}
		}
	 }
	 
	 public int getNumPaginas() {
		return numPaginas;
	 }
	 public void setNumPaginas() {
		 int num;
	        do {
	            System.out.println("Informe o número de páginas:");
	            num = sc.nextInt();
	            if (num < 5) {
	                System.out.println("Quantidade de páginas inválida!");
	            } else {
	                this.numPaginas = num;
	            }
	        } while (num < 5);  
	    }
	 
	 	public void encomendarLivro(){
	 		String respostaEncomenda;
	 		System.out.println("Confirma sua escolha de encomenda? S/N");
	 		sc.nextLine();
	 		respostaEncomenda = sc.nextLine();
	 		
	 		switch(respostaEncomenda.toLowerCase()) {
	 		case "s": System.out.println("Livro adicionado com sucesso!");
	 		break;
	 		case "n": System.out.println("Encomenda cancelada.\nObrigada por usar o sistema!");
	 		break;
	 		default:
	 			System.out.println("Resposta inválida! Por favor Digite S ou N.");
	 			break;
	 		}
	 		
	 	}
	}
		 
