package vista;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Formulario extends javax.swing.JFrame {
    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();
    private JLabel etiqueta3 = new JLabel();
    private JLabel etiqueta4 = new JLabel();
    private JLabel etiqueta5 = new JLabel();
    private JLabel etiqueta6 = new JLabel();
    private JLabel etiqueta7 = new JLabel();
    private JLabel etiqueta8 = new JLabel();

    private JButton btInsertar = new JButton();
    private JButton btModificar = new JButton();
    private JButton btEliminar = new JButton();
    private JButton btLimpiar = new JButton();
    private JButton btBuscar = new JButton();

    private JTextField caja1 = new JTextField();
    private JTextField caja2 = new JTextField();
    private JTextField caja3 = new JTextField();
    private JTextField caja4 = new JTextField();
    private JTextField caja5 = new JTextField();
    private JTextField caja6 = new JTextField();
    private JTextField caja7 = new JTextField();
    private JTextField id = new JTextField();

    private JPanel panel = new JPanel();


    public void iniciarComponentes() {
        panel.setLayout(null);
        this.getContentPane().add(panel);
        etiquetas();
        botones();
        cajasTexto();
    }



    private void etiquetas(){
        //Etiqueta 1
        etiqueta1.setText("Clave:");
        etiqueta1.setBounds(260,363,100,20);
        etiqueta1.setFont(new Font("Helvetica", 0, 17));
        etiqueta1.setForeground(Color.DARK_GRAY);
        panel.add(etiqueta1);
        //Etiqueta 2
        etiqueta2.setText("Nombre:");
        etiqueta2.setBounds(15, 60, 80, 20);
        etiqueta2.setFont(new Font("Helvetica",0,17));
        panel.add(etiqueta2);
        //Etiqueta 3
        etiqueta3.setText("Domicilio:");
        etiqueta3.setBounds(15,100,85,20);
        etiqueta3.setFont(new Font("Helvetica", 0, 17));
        panel.add(etiqueta3);
        //Etiqueta 4
        etiqueta4.setText("Celular:");
        etiqueta4.setBounds(15,140,80,20);
        etiqueta4.setFont(new Font("Helvetica", 0, 17));
        panel.add(etiqueta4);
        //Etiqueta 5
        etiqueta5.setText("Correo electronico:");
        etiqueta5.setBounds(15, 180, 200, 20);
        etiqueta5.setFont(new Font("Helvetica", 0, 17));
        panel.add(etiqueta5);
        //Etiqueta 6
        etiqueta6.setText("Fecha de nacimiento:");
        etiqueta6.setBounds(15,220,200,20);
        etiqueta6.setFont(new Font("Helvetica",0,17));
        panel.add(etiqueta6);
        //Etiqueta 7
        etiqueta7.setText("Género:");
        etiqueta7.setBounds(15,262,80,20);
        etiqueta7.setFont(new Font("Helvetica",0,17));
        panel.add(etiqueta7);

        etiqueta8.setText("Datos del usuario");
        etiqueta8.setBounds(155, 15, 200, 20);
        etiqueta8.setFont(new Font("Helvetica", 2, 17));
        panel.add(etiqueta8);
    }


    private void botones(){
        btInsertar.setText("Insertar");
        btInsertar.setFont(new Font("Arial", 1, 11));
        btInsertar.setBounds(20, 460, 90, 30);
        panel.add(btInsertar);

        btModificar.setText("Modificar");
        btModificar.setFont(new Font("Arial", 1, 11));
        btModificar.setBounds(122, 460, 110, 30);
        panel.add(btModificar);


        btEliminar.setText("Eliminar");
        btEliminar.setFont(new Font("Arial", 1, 11));
        btEliminar.setBounds(245, 460, 90, 30);
        panel.add(btEliminar);

        btLimpiar.setText("Limpiar");
        btLimpiar.setBounds(350, 460, 90, 30);
        btLimpiar.setFont(new Font("Arial", 1, 11));
        panel.add(btLimpiar);

        btBuscar.setText("Buscar");
        btBuscar.setBounds(20, 360, 90, 30);
        btBuscar.setFont(new Font("Arial", 1, 11));
        panel.add(btBuscar);
    }


    private void cajasTexto() {
        caja1.setBounds(320, 361, 130, 25);
        caja1.setVisible(true);
        panel.add(caja1);

        caja2.setBounds(200, 60, 250, 25);
        caja2.setVisible(true);
        panel.add(caja2);

        caja3.setBounds(200, 100, 250, 25);
        caja3.setVisible(true);
        panel.add(caja3);

        caja4.setBounds(200, 140, 250, 25);
        caja4.setVisible(true);
        panel.add(caja4);

        caja5.setBounds(200, 180,250,25);
        caja5.setVisible(true);
        panel.add(caja5);

        caja6.setBounds(200,220,250,25);
        caja6.setVisible(true);
        panel.add(caja6);

        caja7.setBounds(200,260,250,25);
        caja7.setVisible(true);
        panel.add(caja7);

        id.setBounds(390, 20, 60, 25);
        panel.add(id);
        id.setVisible(false);

    }
    public void setCaja1(String caja1){
        this.caja1.setText(caja1);
    }
    public String getCaja1(){
        return caja1.getText();
    }
    public void setCaja2(String caja2){
        this.caja2.setText(caja2);
    }
    public String getCaja2(){
        return caja2.getText();
    }
    public void setCaja3(String caja3){
        this.caja3.setText(caja3);
    }
    public String getCaja3(){
        return caja3.getText();
    }
    public void setCaja4(String caja4){
        this.caja4.setText(caja4);
    }
    public String getCaja4(){
        return caja4.getText();
    }
    public void setCaja5(String caja5){
        this.caja5.setText(caja5);
    }
    public String getCaja5(){
        return caja5.getText();
    }
    public void setCaja6(String caja6){
        this.caja6.setText(caja6);
    }
    public String getCaja6(){
        return caja6.getText();
    }
    public void setCaja7(String caja7){
        this.caja7.setText(caja7);
    }
    public String getCaja7(){
        return caja7.getText();
    }
    public void setId(String id){
        this.id.setText(id);
    }
    public String getId(){
        return this.id.getText();
    }

    public void setBtInsertar(ActionListener btInsertar) {
        this.btInsertar.addActionListener(btInsertar);
    }
    public JButton getBtInsertar(){
        return this.btInsertar;
    }
    public void setBtModificar(ActionListener btModificar) {
        this.btModificar.addActionListener(btModificar);
    }
    public JButton getBtModificar(){
        return this.btModificar;
    }
    public void setBtEliminar(ActionListener btEliminar) {
        this.btEliminar.addActionListener(btEliminar);
    }
    public JButton getBtEliminar(){
        return this.btEliminar;
    }
    public void setBtLimpiar(ActionListener btLimpiar) {
        this.btLimpiar.addActionListener(btLimpiar);
    }
    public JButton getBtLimpiar(){
        return this.btLimpiar;
    }
    public void setBtBuscar(ActionListener btBuscar) {
        this.btBuscar.addActionListener(btBuscar);
    }
    public JButton getBtBuscar(){
        return this.btBuscar;
    }
}
