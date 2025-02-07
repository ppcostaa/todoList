    import java.time.LocalDateTime;
import java.util.List;
public class Alarme {

        public void checarAlarmes(List<Tarefa> listaDeTarefas) {
            LocalDateTime agora = LocalDateTime.now();

            for (Tarefa tarefa : listaDeTarefas) {
                if (tarefa.isAlarmeAtivado() && tarefa.getAlarme() != null) {
                    long minutosRestantes = java.time.Duration.between(agora, tarefa.getAlarme()).toMinutes();

                    if (minutosRestantes <= 120 && minutosRestantes > 0) {
                        System.out.println("\n🚨 Atenção! Sua tarefa '" + tarefa.getNome() + "' está marcada para " + tarefa.getAlarme());
                    }
                }
            }
        }


}
