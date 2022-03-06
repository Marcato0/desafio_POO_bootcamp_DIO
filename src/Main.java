import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Curso JAVA POO");
        cursoJava.setDescricao("Este é um curso de Java Orientado a Objeto");
        cursoJava.setCargaHoraria(12);

        Curso cursoPHP = new Curso();

        cursoPHP.setTitulo("Curso PHP POO");
        cursoPHP.setDescricao("Este é um curso de PHP Orientado a Objeto");
        cursoPHP.setCargaHoraria(15);

        //System.out.println(cursoJava);
        //System.out.println(cursoPHP);

        Mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria referente ao curso de Java");
        mentoriaJava.setData(LocalDate.now());

        //System.out.println(mentoriaJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Developer JAVA e PHP");
        bootcamp.setDescricao("Este é um Bootcamp para desenvolvedores JAVA e PHP");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPHP);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devMarcato = new Dev();
        devMarcato.setNome("Felipe Marcato de Souza");
        devMarcato.inscricaoBootcamp(bootcamp);
        System.out.println(devMarcato.getNome());
        System.out.println("Conteudo Inscritos" + devMarcato.getConteudosIncritos());

        devMarcato.avancarConteudo();
        System.out.println("Conteudo Inscritos" + devMarcato.getConteudosIncritos());
        System.out.println("Conteudo Concluidos" + devMarcato.getConteudosFinalizados());
        System.out.println("XP: " + devMarcato.calcularTotalXP());

        System.out.println("\n");

        Dev devAleatorio = new Dev();
        devAleatorio.setNome("Um nome Aleatorio aqui");
        devAleatorio.inscricaoBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devAleatorio.getConteudosIncritos());

        devAleatorio.avancarConteudo();
        devAleatorio.avancarConteudo();
        devAleatorio.avancarConteudo();
        System.out.println("Conteudo Inscritos" + devAleatorio.getConteudosIncritos());
        System.out.println("Conteudo Concluidos" + devAleatorio.getConteudosFinalizados());
        System.out.println("XP: " + devAleatorio.calcularTotalXP());
    }
}
