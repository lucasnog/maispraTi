package br.com.lucasnog.ui;


import br.com.lucasnog.IUserInterface;
import br.com.lucasnog.model.Dado;

import java.util.List;

public class UserInterface implements IUserInterface {


    @Override
    public void filtrarPorCategoria(List<Dado> dados) {
        System.out.println("=================");
        System.out.println("Filtrando por categoria: ");
        System.out.println(dados);

    }

    @Override
    public void somaPorCategoria(Integer soma) {
        System.out.println("=================");
        System.out.println("A soma de todos os itens da categoria é: " );
        System.out.println(soma);
    }

    @Override
    public void encontrarValorMaximoLista(Dado valorMaximo) {
        System.out.println("=================");

        System.out.println("O maior valor cadastrado é: ");
        System.out.println(valorMaximo.toString());

    }

    @Override
    public void ordenarPorData(List<Dado> listaPorData) {
        System.out.println("=================");
        System.out.println("Ordenando dados por data.");
        System.out.println(listaPorData.toString());
    }

    @Override
    public void ordenarPorValor(List<Dado> listaPorValor) {
        System.out.println("=================");
        System.out.println("Ordenando dados por valor.");
        System.out.println(listaPorValor.toString());
    }

}
