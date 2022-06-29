package model;

public class DiaDosPais extends CartaoDePresente{


    public DiaDosPais(String remetente, String destinatario) {
        super(remetente, destinatario);
    }

    @Override
    public String mostrarMensagem() {
        return "Feliz dia dos Pais";
    }

}
