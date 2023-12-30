import dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("curso");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("java");
        mentoria1.setDescricao("mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("bootcamp Java Development");
        bootcamp.setDescricao("Descrição bootcamp Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos pablo" + devPablo.getConteudosInscritos());
        devPablo.progredir();
        System.out.println("-----");
        System.out.println("Conteudos Inscritos pablo" + devPablo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos pablo" + devPablo.getConteudosConcluidos());







    }
}
