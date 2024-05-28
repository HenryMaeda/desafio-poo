import java.time.LocalDate;

import desafiodio.dominio.Curso ; 
import desafiodio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso(); 
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java"); 
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso() ; 
        curso2.setTitulo("Curso Python") ; 
        curso2.setDescricao("Curso de automação em Python"); 
        curso2.setCargaHoraria(14);

        Mentoria mentoria = new Mentoria(); 
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}