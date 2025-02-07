import java.util.ArrayList;
import java.util.Scanner;

public class RemoverTarefa {
    public static void removerTarefa(ArrayList<Tarefa> tarefas, Scanner scanner) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para remover! ᕙ(▀̿̿ĺ̯̿̿▀̿ ̿) ᕗ");
            return;
        }

        System.out.println("\n✦•······················• Lista de Tarefas •······················•✦");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i).getNome());
        }

        System.out.println("\nDigite o número da tarefa que deseja remover:");
        int indice = scanner.nextInt();

        if (indice < 1 || indice > tarefas.size()) {
            System.out.println("Número inválido! ╰(✿´⌣`✿)╯♡ \nEscolha um número entre 1 e " + tarefas.size());
            return;
        }
        Tarefa removida = tarefas.remove(indice - 1);
        System.out.println("✅ A tarefa '" + removida.getNome() + "' foi removida com sucesso!");
    }
}
