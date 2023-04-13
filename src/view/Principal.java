package view;

import daCruz.Gustavo.pilhaint.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int i;
		
		for(i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				p.Push(i * i);
			} else {
				if(i <= 5) {
					p.Push(i);
				} else {
					try {
						p.Pop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			try {
				System.out.println(p.Top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int Tamanho = p.Size();
		System.out.println("Tamanho da Pilha: " + Tamanho);
		
		int mostra;
		
		for(int cta = 0; cta < Tamanho; cta++) {
			try {
				mostra = p.Top();
				System.out.println(mostra);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
