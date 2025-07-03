package b_model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luidgivarela
 */
import b_model.Cliente;
import java.util.ArrayList;

public class BancoUsuarios {
    public static ArrayList<Cliente> listaUsuarios = new ArrayList<>();


    public static Cliente buscarPorEmail(String email) {
    for (Cliente c : listaUsuarios) {
        if (c.getEmail().equalsIgnoreCase(email)) {
            return c;
        }
    }
    return null;
}
}
