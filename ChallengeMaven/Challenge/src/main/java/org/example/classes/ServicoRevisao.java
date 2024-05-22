package org.example.classes;

public class ServicoRevisao extends Servicos{
    private String itensRevisados, checkList;


    @Override
    public String getTipo() {
        return "Revisão";
    }
}
