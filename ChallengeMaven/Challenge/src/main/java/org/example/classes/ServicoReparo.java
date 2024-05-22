package org.example.classes;

public class ServicoReparo extends Servicos{
    private String componenteReparado, descricaoproblema;

    @Override
    public String getTipo() {
        return "Reparo";
    }
}
