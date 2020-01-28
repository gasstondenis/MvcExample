package org.gaston;

import controlador.CtrlPersona;
import modelo.ConsultaPersona;
import modelo.Persona;
import vista.Formulario;

public class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona();
        ConsultaPersona consultaPersona = new ConsultaPersona();
        Formulario vista = new Formulario();

        CtrlPersona ctrlPersona = new CtrlPersona(persona, consultaPersona, vista);
        ctrlPersona.iniciarVista();
        vista.setVisible(true);
    }
}
