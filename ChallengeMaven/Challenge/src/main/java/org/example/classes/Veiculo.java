package org.example.classes;

public class Veiculo extends Cliente {
    private String placa;
    private String modelo;
    private Integer ano;
    private Double quilometragem;

    public Veiculo(Integer idCliente, String placa, String modelo, Integer ano) {
        super(idCliente);
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Boolean isPlacaValida(){
        return true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }
}
