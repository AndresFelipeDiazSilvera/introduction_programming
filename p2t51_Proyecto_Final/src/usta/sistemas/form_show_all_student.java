package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_student extends JDialog {
    //AUTHOR: Andres Felipe Diaz Silvera
    //DATE: 2020-06-18
    //DESCRIPTION: this class show all data of file c:/students.txt

    public  form_show_all_student (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("List of Students", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel central
        String[] columnsNames ={"Codigo", "Sede","Capacidad" , "Tipo_Deporte"};
        file_data_codigo file_data_codigo=new file_data_codigo();
        JTable tabla_datos= new JTable(file_data_codigo.f_show_data(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        //añadimos los dos paneles al formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        //Parametros generales del formulario
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // modal

    }
}
