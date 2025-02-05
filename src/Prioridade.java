public enum Prioridade {
        NAOIMPORTANTE(1), POUCOIMPORTANTE(2), IMPORTANTE(3), MUITOIMPORTANTE(4), URGENTE(5);

        private final int numero;

    Prioridade(int numero) {
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }

        public static Prioridade porNumero(int numero) {
            for (Prioridade prioridade : Prioridade.values()) {
                if (prioridade.getNumero() == numero) {
                    return prioridade;
                }
            }
            return null;
        }

}
