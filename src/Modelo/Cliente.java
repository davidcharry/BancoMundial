/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mono-
 */
public class Cliente extends Persona {

    CuentaAhorros objetoCuenta = new CuentaAhorros();

    public Cliente() {
    }

    public CuentaAhorros getObjetoCuenta() {
        return objetoCuenta;
    }

    public void setObjetoCuenta(CuentaAhorros objetoCuenta) {
        this.objetoCuenta = objetoCuenta;
    }
}
