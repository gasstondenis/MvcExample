package controlador;

import modelo.ConsultaPersona;
import modelo.Persona;
import vista.Formulario;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class CtrlPersona implements java.awt.event.ActionListener{
    private Persona mod;
    private ConsultaPersona modC;
    private Formulario vista;

    public CtrlPersona(Persona mod, ConsultaPersona modC, Formulario vista){
        this.mod = mod;
        this.modC = modC;
        this.vista = vista;
        this.vista.setBtInsertar(this);
        this.vista.setBtModificar(this);
        this.vista.setBtEliminar(this);
        this.vista.setBtLimpiar(this);
        this.vista.setBtBuscar(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == vista.getBtInsertar()){
            mod.setClave(vista.getCaja1());
            mod.setNombre(vista.getCaja2());
            mod.setDomicilio(vista.getCaja3());
            mod.setCelular(vista.getCaja4());
            mod.setCorreoElectronico(vista.getCaja5());
            mod.setFechaNacimiento(vista.getCaja6());
            if (vista.getGenero() == "Masculino"){
                mod.setGenero("Masculino");
            }
            if (vista.getGenero() == "Femenino") mod.setGenero("Femenino");
            if (modC.registrarPersona(mod)){
                JOptionPane.showMessageDialog(null, "Registro exitoso.");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
                limpiar();
            }

        }
        if (e.getSource() == vista.getBtModificar()){
            mod.setClave(vista.getCaja1());
            mod.setNombre(vista.getCaja2());
            mod.setDomicilio(vista.getCaja3());
            mod.setFechaNacimiento(vista.getCaja6());
            mod.setCelular(vista.getCaja4());
            mod.setCorreoElectronico(vista.getCaja5());
            if (vista.getGenero() == "Masculino"){
                mod.setGenero("Masculino");
            }
            if (vista.getGenero() == "Femenino") mod.setGenero("Femenino");
            if (modC.modificarRegistro(mod)){
                JOptionPane.showMessageDialog(null, "Modificación de registro exitoso.");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                limpiar();
            }

        }
        if (e.getSource() == vista.getBtEliminar()){
            mod.setClave(vista.getCaja1());
            if (modC.eliminarRegistro(mod)){
                JOptionPane.showMessageDialog(null, "Eliminación de registro exitoso.");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiar();
            }

        }
        if (e.getSource() == vista.getBtBuscar()){
            mod.setClave(vista.getCaja1());
            if (modC.buscarRegistro(mod)){
                vista.setId(mod.getPersonaId());
                vista.setCaja1(mod.getClave());
                vista.setCaja2(mod.getNombre());
                vista.setCaja3(mod.getDomicilio());
                vista.setCaja4(mod.getCelular());
                vista.setCaja5(mod.getCorreoElectronico());
                vista.setCaja6(mod.getFechaNacimiento());
                vista.setGenero(mod.getGenero());
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún registro relacionado a la clave ingresada");
                limpiar();
            }

        }
        if (e.getSource() == vista.getBtLimpiar()){
            limpiar();
        }

    }

    public void limpiar(){
        vista.setCaja1(null);
        vista.setCaja2(null);
        vista.setCaja3(null);
        vista.setCaja4(null);
        vista.setCaja5(null);
        vista.setCaja6(null);
        vista.setGenero("Seleccionar");
        vista.setId(null);
    }

    public void iniciarVista(){
        vista.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vista.setSize(460,550);
        vista.setTitle("FORMULARIO");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.iniciarComponentes();
    }
}
