package controletarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {

    Scanner s = new Scanner(System.in);
    ArrayList<Tarefa> lista = new ArrayList<>();

    public void criarTarefa() {
        String titulo;
        String descricao;
        Tarefa t = new Tarefa();
        do {
            System.out.println("Qual titulo você gostaria de colocar na tarefa? ");
            titulo = s.nextLine();

        } while (titulo.isEmpty());
        t.setTitulo(titulo);
        System.out.println("Titulo salvo com sucesso!");

        do {
            System.out.println("Adicione uma descrição para sua tarefa: ");
            descricao = s.nextLine();
        } while (descricao.isEmpty());
        t.setDescrição(descricao);
        System.out.println("Descrição salva com sucesso!");

        System.out.println("Ela foi concluida?\n (sim/não)");
        String resposta = s.next().toLowerCase();
        s.nextLine();

        boolean concluida = resposta.equals("sim");
        t.setConcluida(concluida);
        

        lista.add(t);

        System.out.println("Qual a prioridade da tarefa? (1 - baixa, 2 - media, 3 - alta)");
        int prioridade = s.nextInt();
        s.nextLine();
        t.setPrioridade(prioridade);
        System.out.println("Prioridade salva com sucesso!");

    }

    public void listarTarefa() {
        System.out.println("\n" + lista.size() + " Tarefas Cadastradas: ");
        for (Tarefa t : lista) {
            System.out.println("");
            imprimir(t);
        }

    }

    public void concluirTarefa() {
        System.out.println("Qual tarefa você deseja concluir?");
        String buscar = s.nextLine();
        for (Tarefa t : lista) {
            if (t.getTitulo().equalsIgnoreCase(buscar)) {
                t.marcarComoConcluida();
            } else {
                System.out.println("Digite um titulo válido.");
            }
        }
    }

    public void listarConcluido() {
        System.out.println("\n Tarefas concluidas");

        boolean temConcluida = false;
        for(Tarefa t : lista) {
            if(t.isConcluida()) {
                imprimir(t);
                temConcluida = true;
            }
            if(!temConcluida) {
                System.out.println("Nenhuma tarefa encontrada!");
            }
        }

    }


    public void imprimir(Tarefa a) {

        System.out.println("------------------------------------");
        System.out.println("Titulo: " + a.getTitulo());
        System.out.println("Descrição: " + a.getDescrição());
        System.out.println("Prioridade: " + a.getPrioridade() );
        System.out.println("Situação: " + (a.isConcluida() ? "Concluída" : "Pendente"));
        System.out.println("------------------------------------");
    }

    public void menu() {
        int opcao = 0;
        System.out.println("Olá! Qual o seu nome?");
        String nome = s.nextLine();
        do {
            System.out.println("Certo, " + nome + ", digite a opção desejada: ");
            System.out.println("""
                1 - Adicionar tarefa
                2 - Listar tarefas
                3 - Concluir tarefa
                4 - Listar concluídas
                5 - Sair
                """);
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    criarTarefa();
                    break;
                case 2:
                    listarTarefa();
                    break;
                case 3:
                    concluirTarefa();
                    break;
                case 4:
                    listarConcluido();
                    break;
                case 5:
                    System.out.println("Obrigada por utilizar nosso sistema. \nSistema finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);
    }
}
