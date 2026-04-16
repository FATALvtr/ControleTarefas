
package controletarefa;
    
public class Tarefa {
    
        private String titulo;
        private String descricao;
        private boolean concluida = false;
        
    public Tarefa(String titulo, String descrição, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descrição;
        this.concluida = concluida;
    }

    public Tarefa() {
    }
    
    public String getTitulo() {
        return titulo;
    }
    public String getDescrição() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()){
            System.out.println("A tarefa deve conter um titulo!");
        }else{
            this.titulo = titulo;
        }
    }
    public void setDescrição(String descricao) {
        if (descricao.length() > 200) {
            System.out.println("Descrição deve conter no maximo 200 caracteres!");
        }else{
        this.descricao = descricao;
        }
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public void marcarComoConcluida(){
        this.concluida = true;
        if(concluida){
            System.out.println("Tarefa Concluida!");
        }else{
            System.out.println("Tarefa em andamento!");
        }
    }        
}




