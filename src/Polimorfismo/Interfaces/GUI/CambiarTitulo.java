package Polimorfismo.Interfaces.GUI;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CambiarTitulo extends JFrame implements ActionListener {
	
	JButton pulsame;
	
	public CambiarTitulo() {
		setTitle("Cambiar titulo");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout( new FlowLayout());
		
		pulsame = new JButton("Pulsame");
		pulsame.addActionListener(this);
		add( pulsame);
		
		setVisible( true ); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		setTitle("Ahora me llamo Ventanita");
		getContentPane().setBackground(Color.YELLOW);
		
	}
	
	public static void main(String[] args) {
		new CambiarTitulo();
	}

}
