import java.time.LocalDateTime;

public class Tarefa {
    private String nome;
    private String descricao;
    private String dataTermino;
    private Prioridade prioridade;
    private String categoria;
    private Status status;
    private boolean alarmeAtivado;
    private LocalDateTime alarme;

    public Tarefa(String nome, String descricao, String dataTermino, Prioridade prioridade, String categoria, Status status, boolean alarmeAtivado, LocalDateTime alarme) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
        this.alarmeAtivado = alarmeAtivado;
        this.alarme = alarme;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nData de término: " + dataTermino +
                "\nPrioridade: " + prioridade +
                "\nCategoria: " + categoria +
                "\nStatus: " + status +
                "\n✦•······················•✦•······················•✦";
    }

    public boolean isAlarmeAtivado() {
        return alarmeAtivado;
    }

    public LocalDateTime getAlarme() {
        return alarme;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Prioridade getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
