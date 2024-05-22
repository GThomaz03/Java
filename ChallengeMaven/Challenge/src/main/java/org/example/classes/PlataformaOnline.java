package org.example.classes;

public class PlataformaOnline {
    private String username, senha, email;
    private int idPlataforma;
    private String nome;
    private String url;

    public PlataformaOnline(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void Cadastro(){
        Cliente cliente = new Cliente(00001,"Gabriel", "00000000000", "gasyiufgiasogf@gmail.com","11 963636805", "rua x");

    }
}
