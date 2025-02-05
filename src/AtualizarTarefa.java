import java.util.List;
import java.util.Scanner;

public class AtualizarTarefa {
    public void atualizarTarefa(List<Tarefa> listaDeTarefas, Scanner scanner) {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Não há tarefas para atualizar! ᕙ(▀̿̿ĺ̯̿̿▀̿ ̿) ᕗ");
            return;
        }

        System.out.println("\n✦•······················• Lista de Tarefas •······················•✦");
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeTarefas.get(i).getNome());
        }

        System.out.println("\nDigite o número da tarefa que deseja atualizar:");
        int indice = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        if (indice < 1 || indice > listaDeTarefas.size()) {
            System.out.println("Número inválido! ╰(✿´⌣`✿)╯♡ \nEscolha um número entre 1 e " + listaDeTarefas.size());
            return;
        }

        Tarefa tarefa = listaDeTarefas.get(indice - 1);

        System.out.println("\nO que você deseja atualizar?");
        System.out.println("1. Nome");
        System.out.println("2. Descrição");
        System.out.println("3. Data de término");
        System.out.println("4. Prioridade");
        System.out.println("5. Categoria");
        System.out.println("6. Status");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        switch (escolha) {
            case 1:
                System.out.print("Digite o novo nome: ");
                tarefa.setNome(scanner.nextLine());
                break;
            case 2:
                System.out.print("Digite a nova descrição: ");
                tarefa.setDescricao(scanner.nextLine());
                break;
            case 3:
                System.out.print("Digite a nova data de término (dd/mm/aaaa): ");
                tarefa.setDataTermino(scanner.nextLine());
                break;
            case 4:
                System.out.println("Escolha o novo nível de prioridade:");
                System.out.println("(1) Não importante\n(2) Pouco importante\n(3) Importante\n(4) Muito importante\n(5) Urgente!!!");
                int prioridadeNumero = scanner.nextInt();
                tarefa.setPrioridade(Prioridade.porNumero(prioridadeNumero));
                break;
            case 5:
                System.out.print("Digite a nova categoria: ");
                tarefa.setCategoria(scanner.nextLine());
                break;
            case 6:
                System.out.println("Escolha o novo status:");
                System.out.println("(1) To-do\n(2) Doing\n(3) Done");
                int statusNumero = scanner.nextInt();
                tarefa.setStatus(Status.porNumero(statusNumero));
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Tarefa atualizada com sucesso!");
    }
}
