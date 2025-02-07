import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    public static void iniciarMenu(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Alarme alarme = new Alarme();

        while (true) {
            alarme.checarAlarmes(gerenciador.getListaDeTarefas());
            System.out.println("\nMENU:");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Atualizar Tarefa");
            System.out.println("5. Consultar número de tarefas por status");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha um critério de filtragem:");
                    System.out.println("1. Por Categoria");
                    System.out.println("2. Por Prioridade");
                    System.out.println("3. Por Status");
                    System.out.println("4. Por Data de Término");
                    System.out.println("5. Listar todas as Tarefas");
                    int filtroEscolha = scanner.nextInt();
                    scanner.nextLine();
                    new ListarTarefa().listarTarefas(gerenciador.getListaDeTarefas(), filtroEscolha, scanner);
                    break;
                case 2:
                    new AdicionarTarefa().adicionarTarefa(gerenciador.getListaDeTarefas());
                    break;
                case 3:
                    RemoverTarefa.removerTarefa((ArrayList<Tarefa>) gerenciador.getListaDeTarefas(), scanner);
                    break;
                case 4:
                    new AtualizarTarefa().atualizarTarefa(gerenciador.getListaDeTarefas(), scanner);
                    break;
                case 5:
                    gerenciador.consultarNumeroDeTarefas(gerenciador.getListaDeTarefas());
                    break;
                case 6:
                    System.out.println("Saindo do sistema... ʕ•́ᴥ•̀ʔっ");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! ᕙ(⇀‸↼‶)ᕗ");
            }
        }
    }
}
