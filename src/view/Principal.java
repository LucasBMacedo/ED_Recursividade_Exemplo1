package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		int base = 2;
		int expoente = 8;
		int pot = pc.pot(base, expoente);
		System.out.println("Com laço ==> " + pot);
		
		int potencia = pc.potencia(base, expoente);
		System.out.println("Com recursividade ==> " + potencia);
	}
}