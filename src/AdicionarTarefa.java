import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdicionarTarefa {
    public void adicionarTarefa(List<Tarefa> listaDeTarefas) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


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

        System.out.print("Deseja ativar um alarme para essa tarefa? (S/N): ");
        boolean alarmeAtivado = scanner.nextLine().equalsIgnoreCase("S");

        LocalDateTime alarme = null;
        if (alarmeAtivado) {
            System.out.print("Digite a data e hora do alarme (dd/MM/yyyy HH:mm): ");
            alarme = LocalDateTime.parse(scanner.nextLine(), formatter);
        }


        Prioridade prioridade = Prioridade.porNumero(prioridadeNumero);
        Status status = Status.porNumero(statusNumero);

        Tarefa novaTarefa = new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status, alarmeAtivado, alarme);
        listaDeTarefas.add(novaTarefa);

        System.out.println("\n Tarefa adicionada com sucesso! :)");
    }
}
