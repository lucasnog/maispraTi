package br.com.lucasnog.biblioteca.service;

import java.util.List;

public interface ILivroRepository<T> {
    public void create(T t);

    public void update(T t);

    public void delete(int id);

    public List<T> readAll();

    public List<T> readByStatus(String status);

    public T readById(int id);
}
