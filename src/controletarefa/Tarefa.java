
package controletarefa;
    
public class Tarefa {
    
        private String titulo;
        private String descricao;
        private int prioridade; //1 - baixa, 2 - media, 3 - alta
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
    
    public void setPrioridade(int prioridade) {
        if (prioridade >= 1 && prioridade <= 3) {
            this.prioridade = prioridade;
        } else {
            System.out.println("Prioridade inválida, definida como BAIXA");
            this.prioridade = 3;
        }
    }
    
    public String getPrioridade() {
        switch (prioridade) {
            case 1:
                return "Baixa";
            case 2:
                return "Média";
            case 3:
                return "Alta";
            default:
                return "Prioridade não definida";
        }
    }
    
}




