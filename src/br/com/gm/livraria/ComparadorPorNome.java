package br.com.gm.livraria;

import java.util.Comparator;

import br.com.gm.livraria.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro>{

	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getNome().compareTo(l2.getNome());
	}
}