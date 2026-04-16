
package controletarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    
    Tarefa t = new Tarefa();
    Scanner s = new Scanner(System.in);
    ArrayList<Tarefa> lista = new ArrayList<>();
    
    
    public void criarTarefa (){
        String titulo;
        String descricao;
        do{
            System.out.println("Qual titulo você gostaria de colocar na tarefa? ");
            titulo = s.nextLine();
        }while (titulo.isEmpty());
            t.setTitulo(titulo);
               
        do{            
            System.out.println("Adicione uma descrição para sua tarefa: ");
            descricao = s.nextLine();
        }while (descricao.isEmpty());
            t.setDescrição(descricao);
                
            System.out.println("Ela foi concluida?");
            t.setConcluida(s.nextBoolean());
        
        
            lista.add(t);
    }
    
    public void listarTarefa(){
        System.out.println("\n"+lista.size()+" Tarefas Cadastradas.");
                 for (Tarefa t : lista) {
                    System.out.println("");
                    imprimir();
                 }
        
    }
    
    public void imprimir (){
        
         System.out.println("------------------------------------");
        System.out.println("Titulo: " + t.getTitulo());
        System.out.println("Descrição: " + t.getDescrição());
        System.out.println("Situação: ");
        System.out.println("------------------------------------");
    }
    
    
    public void menu (){
        System.out.println("Olá! Qual o seu nome?");
        String nome = s.nextLine();
     
        System.out.println("Certo, "+nome+", digite a opção desejada: ");
        System.out.println("1 - Adicionar tarefa."
                           + "2 - Listar tarefas."
                           + "3 - Concluir tarefa."
                           + "4 - Sair.");
        int opcao = s.nextInt();
        
        
        switch (opcao) {
            case 1:
                criarTarefa();
            
            case 2: 
                 listarTarefa();
            case 3:
                t.marcarComoConcluida();
            case 4:
                break;
        }
        
        
        
    }
    
    
}
