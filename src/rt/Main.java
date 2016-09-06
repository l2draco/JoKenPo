/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt;

/**
 *
 * @author Richa
 */
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args){
		
		/*codigo desenvolvido por richard trage, baseado em outro codigo ja existente*/
		//variavel para o numero que os jogadores escolherem
		int player1,player2;
		//variavel para salvar o nome dos jogadores
		String nome1,nome2;
		//metodo scanner para gravar e ler os arquivos.
		Scanner scan = new Scanner(System.in);

		System.out.println("-----------------------------------");
		System.out.println(" ------------------------------- ");
		System.out.println("Bem vindo ao nosso jogo de ");
		System.out.println("Jo - ken - po");
		System.out.println("-------------------------------");
		System.out.println ("Jogador 1, digite seu nome e tecle enter: ");
		nome1 = scan.nextLine();
		System.out.println ("Jogador 2, digite seu nome e tecle enter: ");
		nome2 = scan.nextLine();
		System.out.println ("o jogo vai começar... ");
		System.out.println("Digite:\n 1 - Pedra\n 2 - Papel \n 3 - Tesoura");
		
		System.out.println(nome1 +" Escolha um numero: ");
		player1 = scan.nextInt();
		
		System.out.println(nome2 + " Escolha um numero: ");
		player2 = scan.nextInt();
		
		switch (player1){
		case 1 :
			switch (player2){
			case 1:
				System.out.print("O Jogo empatou !");
				break;
			case 2:
				System.out.print(nome2 + " Ganhou a partida!");
				break;
			case 3:
				System.out.print(nome1 + " Ganhou a partida!");
				break;
				default:
					System.out.print("Jogo invalido, digite o numero correto !");
			}
			break;
		case 2:
			switch(player2){
			case 1:
				System.out.print(nome1 + " Ganhou a partida!");
				break;
			case 2:
				System.out.print("Empatou !");
				break;
			case 3:
				System.out.print(nome2 + " Ganhou a partida!");
				break;
				default:
					System.out.print("Jogo invalido, digite o numero correto !");
					
			}
			break;
		case 3:
			switch(player2){
			case 1 :
				System.out.print(nome2 + " Ganhou a partida!");
				break;
			case 2 : 
				System.out.print(nome1 + " Ganhou a partida!");
				break;
			case 3 :
				System.out.print("Empatou !");
				break;
				default:
					System.out.print("Jogo invalido, digite o numero correto !");
			} break;
			default:
				System.out.println("Jogo invalido, digite o numero correto !");
		}	
		//aqui os resultados aparecem de quem ganou a partida.
		System.out.println(nome1 + " ESCOLHEU: " + player1);
		System.out.println(nome2 + " ESCOLHEU: "+ player2);
		    System.out.println ("1 = Pedra | 2 = Papel | 3 = Tesoura !");
			System.out.println ("FIM DO JOGO !");
			System.out.println ("-------------------------------------");
	}
	
}