package br.com.lucasnog.biblioteca.service;

import br.com.lucasnog.biblioteca.model.Livro;

public interface IUIService {

    public Integer menuPrincipal();

    public String entradaTituloLivro();

    public Livro addLivro();

    public void showAll();

    public void alugarLivro();

    public void devolverLivro();

    public void showRented();

    public void showAvailable();

    public void deletarLivro();

    public boolean sair();
}
