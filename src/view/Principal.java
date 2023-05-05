package view;

import br.com.serialexperimentscarina.listaint.ListaInt;
import controller.MaioresController;

public class Principal {

	public static void main(String[] args) {
		ListaInt lista = new ListaInt();
		MaioresController maiorCont = new MaioresController();
		int[] valores = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
		
		try {
			for (int valor : valores) {
				lista.addLast(valor);
			}
			
			int maiorP = maiorCont.posMaior(lista);
			System.out.println("Maior valor da lista : " + lista.get(maiorP));
			lista.remove(maiorP);
			
			int segMaiorP = maiorCont.posMaior(lista);
			System.out.println("Segundo maior valor da lista : " + lista.get(segMaiorP));
			lista.remove(segMaiorP);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
