import java.util.Scanner;
import java.util.List;

public class ListarTarefa {

    public void listarTarefas(List<Tarefa> listaDeTarefas, int filtroEscolha, Scanner scanner) {
        if (listaDeTarefas == null || listaDeTarefas.isEmpty()) {
            System.out.println("Não existem tarefas para listar. ʕ•́ᴥ•̀ʔっ");
            return;
        }

        if (filtroEscolha < 1 || filtroEscolha > 4) {
            System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
            return;
        }

        switch (filtroEscolha) {
            case 1:
                listarPorCategoria(listaDeTarefas, scanner);
                break;
            case 2:
                listarPorPrioridade(listaDeTarefas, scanner);
                break;
            case 3:
                listarPorStatus(listaDeTarefas, scanner);
                break;
            case 4:
                listarPorData(listaDeTarefas, scanner);
                break;

            case 5:
                listarTodas(listaDeTarefas);
                break;
        }
    }

    private void listarPorCategoria(List<Tarefa> listaDeTarefas, Scanner scanner) {
        System.out.print("Digite a categoria para filtrar: ");
        String categoria = scanner.nextLine();

        System.out.println("\n✦•······················• Tarefas por Categoria •······················•✦");
        boolean encontrado = false;
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(tarefa.getNome());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma tarefa encontrada para essa categoria. ʕ•́ᴥ•̀ʔっ");
        }
    }

    private void listarPorPrioridade(List<Tarefa> listaDeTarefas, Scanner scanner) {
        System.out.println("Escolha a prioridade para filtrar:");
        System.out.println("(1) Não importante\n(2) Pouco importante\n(3) Importante\n(4) Muito importante\n(5) Urgente!!!");
        int prioridadeEscolhida = scanner.nextInt();
        scanner.nextLine();

        if (prioridadeEscolhida < 1 || prioridadeEscolhida > 5) {
            System.out.println("Prioridade inválida! Escolha um número entre 1 e 5.");
            return;
        }

        System.out.println("\n✦•······················• Tarefas por Prioridade •······················•✦");
        boolean encontrado = false;
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getPrioridade().getNumero() == prioridadeEscolhida) {
                System.out.println(tarefa.getNome());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma tarefa encontrada para essa prioridade. ʕ•́ᴥ•̀ʔっ");
        }
    }

    private void listarPorStatus(List<Tarefa> listaDeTarefas, Scanner scanner) {
        System.out.println("Escolha o status para filtrar:");
        System.out.println("(1) To-do\n(2) Doing\n(3) Done");
        int statusEscolhido = scanner.nextInt();
        scanner.nextLine();

        if (statusEscolhido < 1 || statusEscolhido > 3) {
            System.out.println("Status inválido! Escolha um número entre 1 e 3.");
            return;
        }

        System.out.println("\n✦•······················• Tarefas por Status •······················•✦");
        boolean encontrado = false;
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getStatus().getNumero() == statusEscolhido) {
                System.out.println(tarefa.getNome());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma tarefa encontrada para esse status. ʕ•́ᴥ•̀ʔっ");
        }
    }
    private void listarPorData(List<Tarefa> listaDeTarefas, Scanner scanner) {
        System.out.print("Digite a data para filtrar (dd/mm/aaaa): ");
        String dataEscolhida = scanner.nextLine();

        System.out.println("\n✦•······················• Tarefas por Data •······················•✦");
        boolean encontrado = false;
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getDataTermino().equals(dataEscolhida)) {
                System.out.println(tarefa.getNome());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma tarefa encontrada para essa data. ʕ•́ᴥ•̀ʔっ");
        }
    }


    private void listarTodas(List<Tarefa> listaDeTarefas) {
        System.out.println("\n✦•······················• Todas as Tarefas •······················•✦");
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Não há tarefas para listar. (╥﹏╥)");
        } else {
            for (Tarefa tarefa : listaDeTarefas) {
                System.out.println(tarefa.getNome());
            }
        }
    }

}
