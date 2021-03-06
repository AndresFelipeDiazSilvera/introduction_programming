package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    //this is constructor (se ejecuta cada vez que yo llame esta clase)
   fondo Fondo = new fondo();

    public form_menu(){
        //etiqueta de nombre del software
        this.setContentPane(Fondo);
        JLabel label_menu = new JLabel("SAC versión JAVA",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,30));
        label_menu.setBounds(0,10,600,50);
        add(label_menu);
        //etiqueta de quien lo creo.
        JLabel label_maker = new JLabel("Creado por Andres Felipe Diaz Silvera",SwingConstants.LEFT);
        label_maker.setBounds(5,300,590,20);
        add(label_maker);
        JButton boton_iniciar = new JButton("iniciar");
        boton_iniciar.setBounds(250,200,100,50);
        //crearle una acción para cuando le de clic
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //crear una instancia del formulario principal
                form_principal form_principal1= new form_principal();
            }
        });
        add(boton_iniciar);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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