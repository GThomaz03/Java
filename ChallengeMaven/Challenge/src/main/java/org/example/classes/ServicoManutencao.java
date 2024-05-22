package org.example.classes;

public class ServicoManutencao extends Servicos{
    private String tipoManutencao, periodicidade;

    @Override
    public String getTipo() {
        return "Manutenção";
    }
}
