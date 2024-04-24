package Classes;

public class Orcamento {
    private int idOrcamento;
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico  servicos;
    private double total;

    public Orcamento(Cliente cliente, Veiculo veiculo, Servico servicos) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = servicos;
    }
}
