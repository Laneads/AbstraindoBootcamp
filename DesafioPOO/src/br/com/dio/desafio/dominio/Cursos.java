package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {
    private int cargaHoraria;

    public Cursos(){   
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
    return "Cursos{" + 
           " Titulo = '" + getTitulo() + '\'' +
           " - Descrição = '" + getDescricao() + '\'' +
           " - Carga Horaria = " + cargaHoraria + 'h' +
           '}';
   }

    @Override
    public double calcularXp() {
        return XP_INICIAL + 100d;
    } 
}

