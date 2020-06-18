package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form_sede extends JFrame {

    JTextField text_codigo, text_sede, text_capacidad, text_tipo_deporte;

    public form_sede(){
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior =new JPanel();
        JLabel label_menu= new JLabel("Espacios Deportivos",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central =new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Codigo: "));
        panel_central.add(text_codigo = new JTextField(""));
        panel_central.add(new JLabel("Sede: "));
        panel_central.add(text_sede = new JTextField(""));
        panel_central.add(new JLabel("Capacidad: "));
        panel_central.add(text_capacidad = new JTextField(""));
        panel_central.add(new JLabel("Tipo De Deporte: "));
        panel_central.add(text_tipo_deporte = new JTextField(""));

        //panel inferior
        JPanel panel_inferior =new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0,0,100,50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_crear_nuevo_estudiante(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);

        //agregar paneles al formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        add(panel_inferior,BorderLayout.SOUTH);
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);


    }

    public void f_crear_nuevo_estudiante (java.awt.event.ActionEvent evt){
        //description: this method
        final JDialog ventanaE = new JDialog(this,"saved data",true);
        if (text_codigo.getText().length()<3 ||text_sede.getText().length()<3||text_capacidad.getText().length()<3 || text_tipo_deporte.getText().length()<3){
            ventanaE.add(new JLabel("todos los campos deben tener minimo 3 caracteres"));
        }else{
            //grabamos en el archivo
            file_data_codigo file_data_students= new file_data_codigo();
            boolean rta =file_data_students.f_add_venue(text_codigo.getText(),text_sede.getText(),text_capacidad.getText(), text_tipo_deporte.getText());
            if (rta==true){
                ventanaE.add(new JLabel("Datos guardados con exito"));
                text_codigo.setText("");
                text_sede.setText("");
                text_capacidad.setText("");
                text_tipo_deporte.setText("");
            }else {
                ventanaE.add(new JLabel("no se pueden guardar los datos en el archivo C:/PRINCIPAL/students.txt"));

            }
        }
        ventanaE.pack();
        ventanaE.setVisible(true);
    }
}