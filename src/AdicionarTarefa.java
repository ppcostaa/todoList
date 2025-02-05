import java.util.List;
import java.util.Scanner;

public class AdicionarTarefa {
    public void adicionarTarefa(List<Tarefa> listaDeTarefas) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da tarefa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a data de término (dd/mm/aaaa): ");
        String dataTermino = scanner.nextLine();

        System.out.print("Digite a categoria da tarefa: ");
        String categoria = scanner.nextLine();

        System.out.println("Escolha o nível de prioridade:");
        System.out.println("(1) Não importante\n(2) Pouco importante\n(3) Importante\n(4) Muito importante\n(5) Urgente!!!");
        int prioridadeNumero = scanner.nextInt();

        System.out.println("Escolha o status da tarefa:");
        System.out.println("(1) To-do\n(2) Doing\n(3) Done");
        int statusNumero = scanner.nextInt();
        scanner.nextLine();

        Prioridade prioridade = Prioridade.porNumero(prioridadeNumero);
        Status status = Status.porNumero(statusNumero);

        Tarefa novaTarefa = new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status);
        listaDeTarefas.add(novaTarefa);

        System.out.println("\n Tarefa adicionada com sucesso! :)");
    }
}
