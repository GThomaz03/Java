package Classes;

public class Fornecedor {
    private int idFornecedor;
    private String nome;
    private String cnpj;
    private String contato;
    private Produto produtos;

    public Fornecedor(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public Boolean isCnpjValid(){
        return true;
    }
}
