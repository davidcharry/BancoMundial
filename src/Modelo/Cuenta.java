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
public abstract class Cuenta implements Impuestos {

    protected long saldo, nocuenta;

    public Cuenta() {
        this.saldo = 100000;
    }

    public Cuenta(long saldo, long nocuenta) {
        this.saldo = saldo;
        this.nocuenta = nocuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(long nocuenta) {
        this.nocuenta = nocuenta;
    }

    public abstract void retirar(long valor);

    public abstract void consignar(long valor);
}
