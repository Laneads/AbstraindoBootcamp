package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(){   
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
   @Override
   public String toString() {
    return "Mentoria{" + 
           " Titulo = '" + getTitulo() + '\'' +
           " - Descrição = '" + getDescricao() + '\'' +
           " -  Data = " + data +
           '}';
   }

@Override
public double calcularXp() {
    return XP_INICIAL + 50d;
}
}
