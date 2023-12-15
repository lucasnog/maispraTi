package br.com.lucasnog.impl;

import br.com.lucasnog.IDadosRepository;
import br.com.lucasnog.model.Dado;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnaliseDados implements IDadosRepository {

    @Override
    public List<Dado> filtrarPorCategoria(List<Dado> dados, String categoria) {
        return dados.stream()
                .filter(dado -> dado.getCategoria().equals(categoria))
                .collect(Collectors.toList());
    }

    @Override
    public Integer somaPorCategoria(List<Dado> dados, String categoria) {

        return dados.stream()
                .filter(dado -> dado.getCategoria().equals(categoria))
                .map(Dado::getValor)
                .reduce(0, Integer::sum);
    }

    @Override
    public List<Dado> ordenarPorValor(List<Dado> dados) {
        return dados.stream()
                .sorted(Comparator.comparingInt(Dado::getValor))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dado> ordenarPorData(List<Dado> dados) {
         return dados.stream()
                .sorted(Comparator.comparingInt(Dado::getValor))
                .collect(Collectors.toList());
    }

    @Override
    public Dado encontrarValorMaximoLista(List<Dado> dados) {
           return dados.stream()
                .max(Comparator.comparingInt(Dado::getValor))
                .orElse(null);
    }
}
