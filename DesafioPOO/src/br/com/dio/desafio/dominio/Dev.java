package br.com.dio.desafio.dominio;

import java.util.Optional;
import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
    
    public Dev(String nome, Set<Conteudo> conteudoInscritos, Set<Conteudo> conteudoConcluidos) {
        this.nome = nome;
        this.conteudoInscritos = conteudoInscritos;
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public Dev() {
    }

    //METODOS
    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else{
            System.err.println("Lamento! \n Você não está inscrito neste conteúdo!");
        }
    }

    public double calcularTotalXp(){ 
        return this.conteudoConcluidos
                .stream().mapToDouble(Conteudo::calcularXp).sum();
    }
    

    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }



    //EQUALS E HASH
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
