package br.edu.univas.view;

public class MenuView {

	public void showMainMenu() {
		System.out.println("\nCONTROLE DE GASTO COM CART�O\n");
		System.out.println("1 - Cadastrar usu�rio");
		System.out.println("2 - Logar");
		System.out.println("3 - Cadastrar Gasto");
		System.out.println("4 - Listar Gastos");
		System.out.println("9 - Sair");
		System.out.print("\nPor favor, digite sua op��o:");
	}
	
	public void showFarewell() {
		System.out.println("\nObrigado por utilizar nosso sistema!");
		System.out.println("Volte sempre!");
	}

	public void showInvalidOption() {
		System.out.println("\nOp��o inv�lida!");
		System.out.println("Por favor, digite uma op��o correta!");
	}
	
	public void showUserNotLogged() {
		System.out.println("\nPara essa opera��o, voc� precisa estar logado!\n");
	}
}
