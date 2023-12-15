package br.com.lucasnog;

import br.com.lucasnog.model.Dado;

import java.util.List;

public interface IDadosRepository {

    public List<Dado> filtrarPorCategoria(List<Dado> dados, String categoria);
    public Integer somaPorCategoria(List<Dado> dados, String categoria);
    public Dado encontrarValorMaximoLista(List<Dado> lista);
    public List<Dado> ordenarPorData(List<Dado> lista);
    public List<Dado> ordenarPorValor(List<Dado> lista);


}
