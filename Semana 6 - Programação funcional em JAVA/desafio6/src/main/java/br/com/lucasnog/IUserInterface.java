package br.com.lucasnog;

import br.com.lucasnog.model.Dado;

import java.util.List;

public interface IUserInterface {

    public void mostrarDadosFiltradosPorCategoria(List<Dado> dados);
    public void mostrarSomaPorCategoria(Integer soma);
    public void mostrarValorMaximo(Dado valorMaximo);
    public void mostrarDadosOrdenadosPorData(List<Dado> listaPorData);
    public void mostrarDadosOrdenadosPorValor(List<Dado> listaPorValor);

}
