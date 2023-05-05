package controller;

import br.com.serialexperimentscarina.listaint.ListaInt;

public class MaioresController {
	
	// Retorna posição do atual maior valor da lista
	public int posMaior(ListaInt lista) throws Exception {
		int tamanho = lista.size();
		int maior = lista.get(0), pos = 0;
		
		for (int i = 1; i < tamanho; i++) {
			int valor = lista.get(i);
			if (valor > maior) {
				maior = valor;
				pos = i;
			}
		}
		return pos;
		
	}

}
