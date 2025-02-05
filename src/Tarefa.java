public class Tarefa {
    private String nome;
    private String descricao;
    private String dataTermino;
    private Prioridade prioridade;
    private String categoria;
    private Status status;

    public Tarefa(String nome, String descricao, String dataTermino, Prioridade prioridade, String categoria, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
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
