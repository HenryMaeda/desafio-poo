package desafiodio.dominio;

public class Curso extends Conteudo {
    
    private int cargaHoraria ;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp () {
        return XP_PADRAO * cargaHoraria ; 
    }

    @Override
    public String toString() {
        return "Titulo do curso = " + getTitulo() + ", descricao do curso = " + getDescricao() + ", carga horaria do curso= " + cargaHoraria + " .";
    } 

    

    
}
