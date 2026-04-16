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

    public void imprimir(Tarefa a) {

        System.out.println("------------------------------------");
        System.out.println("Titulo: " + a.getTitulo());
        System.out.println("Descrição: " + a.getDescrição());
        System.out.println("Situação: " + (a.isConcluida() ? "Concluída" : "Pendente"));
        System.out.println("------------------------------------");
    }

    public void menu() {
        int opcao = 0;
        System.out.println("Olá! Qual o seu nome?");
        String nome = s.nextLine();
        do {
            System.out.println("Certo, " + nome + ", digite a opção desejada: ");
            System.out.println("1 - Adicionar tarefa.\n2 - Listar tarefas.\n3 - Concluir tarefa.\n4 - Sair.");
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
                    System.out.println("Obrigada por utilizar nosso sistema. \nSistema finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);
    }
}
