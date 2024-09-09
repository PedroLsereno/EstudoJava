class General {
    private int id;
    private boolean traidor;
    private String ordem;

    public General(int id, boolean traidor, String ordem) {
        this.id = id;
        this.traidor = traidor;
        this.ordem = ordem;
    }

    public String enviarOrdem() {
        // Traidor enviando uma ordem aleatória
        if (traidor) {
            return Math.random() > 0.5 ? "atacar" : "recuar";
        }
        return ordem; 
    }

    public int getId() {
        return id;
    }

    public boolean traidor() {
        return traidor;
    }
}