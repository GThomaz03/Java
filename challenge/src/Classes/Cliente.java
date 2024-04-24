package Classes;

public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    //Construtores
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    //Métodos
    private Boolean IsCpfValido(){
        return true;
    }

    private Boolean isTelefonVald(){
        return true;
    }

    private Boolean isEmailValid(){
     return true;
    }

    
}
