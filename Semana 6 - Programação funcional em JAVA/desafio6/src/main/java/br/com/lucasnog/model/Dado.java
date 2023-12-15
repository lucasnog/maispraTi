package br.com.lucasnog.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dado {
    private static int contador = 0;
    int id;
    Integer valor;
    String categoria;
    Date data;

    private int generateId(){
        return ++contador;
    }

    public Dado(String categoria, String data, Integer valor) throws ParseException {
        this.id = generateId();
        this.categoria = categoria;
        this.data =  new SimpleDateFormat("dd/MM/yyyy").parse(data);
        this.valor = valor;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Dado{" +
                "id='" + id + '\'' +
                ", categoria='" + categoria + '\'' +
                ", data='" + dateFormat.format(data) + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
