/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JLabel;

/**
 *
 * @author mono-
 */
public class CuentaAhorros extends Cuenta {

    private String clave;

    public CuentaAhorros() {
        clave = "1234";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void retirar(long valor) {
        this.saldo = (long) (saldo - valor - Impuestocuatromil(valor));
    }

    @Override
    public void consignar(long valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public double Impuestocuatromil(long valor) {
        this.saldo = (valor * 4) / 1000;
        return this.saldo;
    }

    public boolean valClave(String Clave) {
        boolean a;
        if (Clave.equals(clave)) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

}
