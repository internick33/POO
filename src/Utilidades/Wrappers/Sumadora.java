package Utilidades.Wrappers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sumadora extends JFrame implements ActionListener {
	
	JTextField valor1;
	JTextField valor2;
	JLabel suma;
	JLabel igual;
	JLabel resultado;
	JButton sumar;
	Integer sumando1, sumando2;
	
	Sumadora(){
		setTitle("Sumadora");
		setSize(300,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		valor1 =  new JTextField("0",5);
		valor2 =  new JTextField("0",5);
		suma = new JLabel("+");
		igual = new JLabel("=");
		resultado = new JLabel("0");
		sumar = new JButton("Sumar");
		sumar.addActionListener(this);
		
		add(sumar);
		add(valor1);
		add(suma);
		add(valor2);
		add(igual);
		add(resultado);
		setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			sumando1 = Integer.parseInt(valor1.getText());
			sumando2 = Integer.parseInt(valor2.getText());
			resultado.setText(String.valueOf(sumando1+sumando2));
			valor1.setText("");
			valor2.setText("");
		}
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"Los datos introducidos deben ser numericos");
			valor1.setText("");
			valor2.setText("");
			resultado.setText("0.0");
		}
	}

	public static void main(String[] args) {
		new Sumadora();
	}
}
