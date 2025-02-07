public enum Status {
    TODO(1), DOING(2), DONE(3);

    private final int numero;

    Status(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static Status porNumero(int numero) {
        for (Status status : Status.values()) {
            if (status.getNumero() == numero) {
                return status;
            }
        }
        return null;
    }
}
