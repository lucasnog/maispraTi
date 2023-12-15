package br.com.lucasnog.ui;


import br.com.lucasnog.IUserInterface;
import br.com.lucasnog.model.Dado;

import java.util.List;

public class UserInterface implements IUserInterface {


    @Override
    public void mostrarDadosFiltradosPorCategoria(List<Dado> dados) {
        System.out.println("=================");
        System.out.println("Filtrando por categoria: ");
        System.out.println(dados);

    }

    @Override
    public void mostrarSomaPorCategoria(Integer soma) {
        System.out.println("=================");
        System.out.println("A soma de todos os itens da categoria é: " );
        System.out.println(soma);
    }

    @Override
    public void mostrarValorMaximo(Dado valorMaximo) {
        System.out.println("=================");

        System.out.println("O maior valor cadastrado é: ");
        System.out.println(valorMaximo.toString());

    }

    @Override
    public void mostrarDadosOrdenadosPorData(List<Dado> listaPorData) {
        System.out.println("=================");
        System.out.println("Ordenando dados por data.");
        System.out.println(listaPorData.toString());
    }

    @Override
    public void mostrarDadosOrdenadosPorValor(List<Dado> listaPorValor) {
        System.out.println("=================");
        System.out.println("Ordenando dados por valor.");
        System.out.println(listaPorValor.toString());
    }

}
