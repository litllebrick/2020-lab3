package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.controller.JogoController;
import br.edu.univas.vo.Jogo;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			JogoController controller = new JogoController();
			System.out.println("1 - Gerar 1000 jogos aleat�rios");
			System.out.println("2 - Gerar 10000 jogos aleat�rios");
			System.out.println("3 - Gerar 100000 jogos aleat�rios");
			System.out.println("4 - Gerar 1000000 jogos aleat�rios");
			System.out.println("5 - Limpar mem�ria");
			System.out.println("9 - Sair");
			System.out.println("Digite sua op��o:\n");
			
			int option = scanner.nextInt();
			
			if (option == 1) {
				for (int i = 0; i < 1000; i++) {
					Jogo jogo = controller.generateRandomGame();
					System.out.println(jogo);
				}
					
			} else if (option == 2) {
				for (int i = 0; i < 10000; i++) {
					Jogo jogo = controller.generateRandomGame();
					System.out.println(jogo);
				}
				
			} else if (option == 3) {
				for (int i = 0; i < 100000; i++) {
					Jogo jogo = controller.generateRandomGame();
					System.out.println(jogo);
				}
				
			} else if (option == 4) {
				for (int i = 0; i < 1000000; i++) {
					Jogo jogo = controller.generateRandomGame();
					System.out.println(jogo);
				}
				
			} else if (option == 5) {
				System.gc();
				
			} else if (option == 9) {
				break;
			}
			
		} while(true);
		
		scanner.close();
	}
	
}
