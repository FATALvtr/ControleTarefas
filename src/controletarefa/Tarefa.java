
package controletarefa;
    
public class Tarefa {
    
        private String titulo;
        private String descrição;
        private boolean concluida = false;

    public Tarefa(String titulo, String descrição, boolean concluida) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    
    public void marcarComoConcluida(Tarefa t){
        t.concluida = false;
        if(t.concluida == true ){
            System.out.println("Tarefa Concluida!");
        }else{
            System.out.println("Tarefa não concluida!");
        }
    }
        
    }
}



