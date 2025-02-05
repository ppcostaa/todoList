import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private final List<Tarefa> listaDeTarefas;

    public GerenciadorDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public List<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }
    public void consultarNumeroDeTarefas(List<Tarefa> listaDeTarefas) {
        int todoCount = 0, doingCount = 0, doneCount = 0;

        for (Tarefa tarefa : listaDeTarefas) {
            switch (tarefa.getStatus()) {
                case TODO:
                    todoCount++;
                    break;
                case DOING:
                    doingCount++;
                    break;
                case DONE:
                    doneCount++;
                    break;
            }
        }


        System.out.println("\nTarefas por Status:");
        System.out.println("ToDo: " + todoCount);
        System.out.println("Doing: " + doingCount);
        System.out.println("Done: " + doneCount);
    }
}
