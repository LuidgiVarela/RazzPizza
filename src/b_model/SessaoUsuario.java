/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_model;
import b_model.UsuarioLogado;

/**
 *
 * @author luidgivarela
 */
public class SessaoUsuario implements UsuarioLogado {
    
    private static SessaoUsuario instancia; 
    private Cliente clienteLogado;

    private SessaoUsuario() {
        // Construtor privado para impedir instâncias externas
    }

    public static SessaoUsuario getInstancia() {
        if (instancia == null) {
            instancia = new SessaoUsuario();
        }
        return instancia;
    }

    @Override
    public void setUsuarioLogado(Cliente cliente) {
        clienteLogado = cliente;
    }

    @Override
    public Cliente getUsuarioLogado() {
        return clienteLogado;
    }
}
