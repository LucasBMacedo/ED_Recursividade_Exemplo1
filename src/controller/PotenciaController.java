package controller;

public class PotenciaController {

	public PotenciaController() {
		super ();
	}
public int potencia(int base, int expoente) {
	if (expoente == 0) {
		return 1;
	}
	else {
		expoente--;
		return base * potencia(base, expoente); 
	}
}
public int pot(int base, int expoente) {
	int cont = 0;
	int res = 1;
	while (cont < expoente) {
		res = res * base;
		cont++;
	}
	return res;
}
}