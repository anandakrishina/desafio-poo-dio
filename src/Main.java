import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição da mentoria de JS");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JS Developer");
        bootcamp2.setDescricao("Descrição do Bootcamp JS Developer");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devAnanda = new Dev();
        devAnanda.setNome("Ananda");
        devAnanda.inscreverBootcamp(bootcamp1);
        System.out.println(devAnanda.getNome()+" - Conteudos inscritos: "+devAnanda.getConteudosInscritos());
        devAnanda.progredir();
        System.out.println(devAnanda.getNome()+" - Conteudos concluidos: "+devAnanda.getConteudosConcluidos());
        System.out.println(devAnanda.getNome()+" - Conteudos inscritos: "+devAnanda.getConteudosInscritos());

        System.out.println("__________________________________");
        Dev devKrishina = new Dev();
        devKrishina.setNome("Krishina");
        devKrishina.inscreverBootcamp(bootcamp2);
        System.out.println(devKrishina.getNome()+" - Conteudos inscritos: "+devKrishina.getConteudosInscritos());
        devKrishina.progredir();
        System.out.println(devKrishina.getNome()+" - Conteudos concluidos: "+devKrishina.getConteudosConcluidos());
        System.out.println(devKrishina.getNome()+" - Conteudos inscritos: "+devKrishina.getConteudosInscritos());
        System.out.println();
        devKrishina.progredir();
        System.out.println(devKrishina.getNome()+" - Conteudos concluidos: "+devKrishina.getConteudosConcluidos());
        System.out.println(devKrishina.getNome()+" - Conteudos inscritos: "+devKrishina.getConteudosInscritos());
        System.out.println();
        devKrishina.progredir();
        System.out.println(devKrishina.getNome()+" - Conteudos concluidos: "+devKrishina.getConteudosConcluidos());
        System.out.println(devKrishina.getNome()+" - Conteudos inscritos: "+devKrishina.getConteudosInscritos());
        System.out.println();
        devKrishina.progredir();
        System.out.println(devKrishina.getNome()+" - Conteudos concluidos: "+devKrishina.getConteudosConcluidos());
        System.out.println(devKrishina.getNome()+" - Conteudos inscritos: "+devKrishina.getConteudosInscritos());


    }
}
