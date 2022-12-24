
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class POO {
    public static void main(String[] args) throws Exception {
        
        Cursos curso = new Cursos();
        curso.setTitulo("Java");
        curso.setDescricao("Curso sobre Java");
        curso.setCargaHoraria(40);
        
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Spring Boot");
        curso1.setDescricao("Curso sobre Spring Boot");
        curso1.setCargaHoraria(20);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre o curso de Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição sobre o Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso);
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(mentoria);


        Dev devLiz = new Dev();
        devLiz.setNome("Liz");
        devLiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Liz" + devLiz.getConteudoInscritos());
        
        devLiz.progredir();
        devLiz.progredir();
        System.out.println("~~~");
        System.out.println("Conteúdos Inscritos Liz" + devLiz.getConteudoInscritos());
        System.out.println("Conteúdos Concluido Liz" + devLiz.getConteudoConcluidos());
        System.out.println("XP: " + devLiz.calcularTotalXp());


        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxx \n");


        Dev devLane = new Dev();
        devLane.setNome("Lane");
        devLane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lane" + devLane.getConteudoInscritos());
        
        devLane.progredir();
        devLane.progredir();
        devLane.progredir();
        System.out.println("~~~");
        System.out.println("Conteúdos Inscritos Lane" + devLane.getConteudoInscritos());
        System.out.println("Conteúdos Concluido Lane" + devLiz.getConteudoConcluidos());
        System.out.println("XP: " + devLane.calcularTotalXp());

        
    }
}
