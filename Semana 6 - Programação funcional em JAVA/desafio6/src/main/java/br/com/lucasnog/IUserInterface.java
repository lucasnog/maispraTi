package br.com.lucasnog;

import br.com.lucasnog.model.Dado;

import java.util.List;

public interface IUserInterface {

    public void filtrarPorCategoria(List<Dado> dados);
    public void somaPorCategoria(Integer soma);
    public void encontrarValorMaximoLista(Dado valorMaximo);
    public void ordenarPorData(List<Dado> listaPorData);
    public void ordenarPorValor(List<Dado> listaPorValor);

}
