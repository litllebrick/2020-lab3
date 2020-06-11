package br.edu.univas.view;

import java.util.List;

import br.edu.univas.vo.CreditCard;

public class UserView {

	public void showRegisterUser() {
		System.out.println("\nCADASTRO DE USU�RIO\n");
	}
	
	public void showRegisterUserName() {
		System.out.print("\nDigite seu nome:");
	}
	
	public void showRegisterUserCellphone() {
		System.out.print("\nDigite seu celular:");
	}
	
	public void showRegisterSuccessful() {
		System.out.println("\nUsu�rio cadastrado com sucesso!\n");
	}

	public void showAddNewCreditCard() {
		System.out.println("\nCADASTRO DE CART�O DE CR�DITO\n");
	}
	
	public void showRegisterCreditCardBrand() {
		System.out.print("\nDigite a bandeira do cart�o:");
	}
	
	public void showRegisterCreditCardLimit() {
		System.out.print("\nDigite o limite total do cart�o:");
	}
	
	public void showRegisterCrediCardSuccesful() {
		System.out.println("\nCart�o de cr�dito cadastrado com sucesso!\n");
	}
	
	public void showAddNewPurchase() {
		System.out.println("\nLAN�AMENTO DE COMPRAS\n");
	}
	
	public void showCreditCardsFromUser(List<CreditCard> cards) {
		System.out.print("\nAbaixo a lista de cart�es:");
		for (int i = 0; i < cards.size(); i++) {
			System.out.println((i + 1) + " - " + cards.get(i).getBrand());
		}
	}
	
	public void showSelectCreditCard() {
		System.out.print("\nPor favor, digite uma op��o v�lida:");
	}
	
	public void showRegisterPurchaseValue() {
		System.out.print("\nDigite o valor da compra:");
	}
	
	public void showRegisterPurchaseDate() {
		System.out.print("\nDigite a data da compra:");
	}
	
	public void showRegisterPurchaseQuotes() {
		System.out.print("\nDigite a quantidade de parcelas:");
	}
	
	public void showRegisterPurchaseSuccesful() {
		System.out.println("\nCompra cadastrada com sucesso!\n");
	}
	
}
