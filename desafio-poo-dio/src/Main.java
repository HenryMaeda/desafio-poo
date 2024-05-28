import java.time.LocalDate;

import desafiodio.dominio.Curso ; 
import desafiodio.dominio.Mentoria;
import desafiodio.dominio.Bootcamp;
import desafiodio.dominio.Dev;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso(); 
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java"); 
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso() ; 
        curso2.setTitulo("Curso Java com IA") ; 
        curso2.setDescricao("Curso de Java com uso de IA"); 
        curso2.setCargaHoraria(14);

        Mentoria mentoria = new Mentoria(); 
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer"); 
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2); 
        bootcamp.getConteudos().add(mentoria); 

        Dev devHenry = new Dev(); 
        devHenry.setNome("Henry");
        devHenry.inscreverBootcamp(bootcamp);
        devHenry.progredir();
        devHenry.progredir();
        System.out.println("Conteudos Inscritos Henry: " + devHenry.getConteudosInscritos());
        System.out.println("Conteudos Conlcuidos Henry: " + devHenry.getConteudosConcluidos());
        System.out.println("Total XP: " + devHenry.calcularTotalXp());

        System.out.println("=====================");

        Dev devJorge = new Dev(); 
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        devJorge.progredir();
        System.out.println("Conteudos Inscritos Jorge: " + devJorge.getConteudosInscritos());
        System.out.println("Conteudos Conlcuidos Jorge: " + devJorge.getConteudosConcluidos());
        System.out.println("Total XP: " + devJorge.calcularTotalXp());






    }
}
