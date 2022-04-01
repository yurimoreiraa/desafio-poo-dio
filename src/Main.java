import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");
        devYuri.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Yuri:" + devYuri.getConteudosInscritos());
        devYuri.progredir();
        devYuri.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Yuri:" + devYuri.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Yuri:" + devYuri.getConteudosConcluidos());
        System.out.println("XP:" + devYuri.calcularTotalXp());
        System.out.println("-");
        devYuri.publicarArtigo("Titulo 1", "Conteúdo 1");
        devYuri.publicarArtigo("Titulo 2", "Conteúdo 2");
        devYuri.publicarArtigo("Titulo 3", "Conteúdo 3");
        System.out.println("Conteúdo do(s) Artigo(s): " + devYuri.getArtigos());
        System.out.println("-");
        devYuri.setCurriculo(new Curriculo("Yuri Moreira", "7199999-9999", "yuri.moreira@gmail.com", 3000d));
        devYuri.setFormacao(new FormacaoAcademica("Universidade ABC", "Bacharelado", "Administração", LocalDate.of(2015,8,1), LocalDate.of(2019,12,31)));
        devYuri.setExperiencia(new ExperienciaProfissional("Grupo GFT", "QA Jr.", "Teste de software", LocalDate.of(2022,4,1)));
        System.out.println("Currículo" + "\n" + devYuri.getCurriculo());
        System.out.println("Formação Acadêmica" + "\n" + devYuri.getFormacao());
        System.out.println("Experiência Profissional" + "\n" + devYuri.getExperiencia());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
