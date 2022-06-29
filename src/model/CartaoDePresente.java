package model;

public abstract class CartaoDePresente {
    private final String remetente;
    private final String destinatario;

    public CartaoDePresente(String remetente, String destinatario){
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public abstract String mostrarMensagem();

}
