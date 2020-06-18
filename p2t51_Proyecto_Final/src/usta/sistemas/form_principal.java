package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    fondo Fondo = new fondo();
    public form_principal(){
        this.setContentPane(Fondo);
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("Menú principal",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo= new fondo();
        panel_izquierdo.setLayout(new GridLayout(3,1));
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("Espacios Deportivos");
        boton_formulario1.setBounds(0,0,100,30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //
                form_sede form_student1=new form_sede();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario2 = new JButton("Lista de Espacios Deportivos");
        boton_formulario2.setBounds(0,0,100,30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        //creamos el tercer boton (acercade).
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setBounds(0,0,100,30);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acercade form_acercade1= new form_acercade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        // creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Andres Felipe Diaz Silvera"));
        //agregar los paneles al formulario (jframe).
        add(panel_superior,BorderLayout.NORTH);
        add(panel_izquierdo,BorderLayout.WEST);
        add(panel_inferior,BorderLayout.SOUTH);

        //parametros generales del formularios
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600, 400);
        setLocationRelativeTo(null);
    }
    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt){
        form_show_all_student form_show_all_student1= new form_show_all_student(this);
    }
    class fondo extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/ladrillo.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);

            setOpaque(false);
            super.paint(g);
        }
    }

}