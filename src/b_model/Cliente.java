package b_model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luidgivarela
 */


// import model.CartaoSalvo; // Descomente quando a classe CartaoSalvo estiver disponível



public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String cep;
    private String numero;
    private String senha;
    // private CartaoSalvo cartaoSalvo; // Atributo para guardar o cartão salvo
    
    public Cliente(String nome, String email, String telefone, String cep, String senha, String numero) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.numero = numero;
    }
 
    /*
    public CartaoSalvo getCartaoSalvo() {
        return cartaoSalvo;
    }

    public void setCartaoSalvo(CartaoSalvo cartaoSalvo) {
        this.cartaoSalvo = cartaoSalvo;
    }
    */
    
    // Métodos GET
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getCep() { return cep; }
    public String getNumero() { return numero; }
    public String getSenha(){ return senha;}

    // Métodos SET
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setCep(String cep) { this.cep = cep; }
    public void setNumero(String numero) { this.numero = numero; }    
    public void setSenha(String senha){ this.senha = senha; }
    
}



