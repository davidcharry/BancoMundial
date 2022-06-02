/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.ConsultarCliente;
import Vista.FormularioConsignar;
import Vista.FormularioPrincipal;
import Vista.Retirar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mono-
 */
public class Control implements ActionListener {

    FormularioPrincipal objPpal;
    FormularioConsignar objConsignar;
    Cliente objCliente;
    ConsultarCliente objConsultar;
    Retirar objRetirar;

    public Control() {
        objPpal = new FormularioPrincipal();
        objConsignar = new FormularioConsignar();
        objCliente = new Cliente();
        objConsultar = new ConsultarCliente();
        objCliente.setNombre("David Charry");
        objRetirar = new Retirar();

        objPpal.getEscritorio().add(objConsignar);
        objPpal.getEscritorio().add(objConsultar);
        objPpal.getEscritorio().add(objRetirar);
        objPpal.getMenuIConsignar().addActionListener(this);
        objPpal.getMenuIRetirar().addActionListener(this);
        objPpal.getMenuIConsultarC().addActionListener(this);
        objPpal.getMenuSalir().addActionListener(this);

        objConsignar.getBtnConsignar().addActionListener(this);
        objConsignar.getBtnCancelar().addActionListener(this);
        objConsultar.getBtnCerrar().addActionListener(this);
        objRetirar.getBtnRetirar().addActionListener(this);
        objRetirar.getBtnCancelar().addActionListener(this);
    }

    public void Iniciar() {
        objPpal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objPpal.getMenuIConsignar()) {
            objConsultar.setVisible(false);
            objRetirar.setVisible(false);
            objConsignar.setVisible(true);
        }
        if (e.getSource() == objConsignar.getBtnConsignar()) {
            if (objCliente.getObjetoCuenta().valClave(String.valueOf(objConsignar.getTxtClave().getPassword()))) {
                objCliente.getObjetoCuenta().consignar(Long.parseLong(objConsignar.getTxtValor().getText()));
            }
        }
        if (e.getSource() == objConsignar.getBtnCancelar()) {
            objConsignar.setVisible(false);
        }
        if (e.getSource() == objPpal.getMenuIConsultarC()) {
            objConsignar.setVisible(false);
            objRetirar.setVisible(false);
            objConsultar.setVisible(true);
            objConsultar.getLblCliente().setText(objCliente.getNombre());
            objConsultar.getLblSaldo().setText("" + objCliente.getObjetoCuenta().getSaldo());
        }
        if (e.getSource() == objConsultar.getBtnCerrar()) {
            objConsultar.setVisible(false);
        }
        if (e.getSource() == objPpal.getMenuIRetirar()) {
            objConsultar.setVisible(false);
            objConsignar.setVisible(false);
            objRetirar.setVisible(true);
        }
        if (e.getSource() == objRetirar.getBtnRetirar()) {
            if (objCliente.getObjetoCuenta().valClave(String.valueOf(objRetirar.getTxtClave().getPassword()))) {
                objCliente.getObjetoCuenta().retirar(Long.parseLong(objRetirar.getTxtValor().getText()));
            }
        }
        if (e.getSource() == objRetirar.getBtnCancelar()) {
            objRetirar.setVisible(false);
        }

        if (e.getSource() == objPpal.getMenuSalir()) {
            System.exit(0);
        }
    }
}
