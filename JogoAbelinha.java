package teste;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JogoAbelinha extends JFrame {

	JLabel bee = new JLabel(new ImageIcon("imagem\\bee.png"));

	public JogoAbelinha() {
		editarJanela();
		new Movimento().start();
	}

	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400, 350);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		bee.setBounds(100, 0, 200, 100);
		add(bee);

	}

	public class Movimento extends Thread {
		public void run() {
			while (true) {
				try {
					sleep(20);
				} catch (Exception erro) {
					
				}
			
			if(bee.getX() <= 500) {
				bee.setBounds(bee.getX() + 1, 0, 200, 100);
			
			}
			}
		}

	}

	public static void main(String[] args) {
		new JogoAbelinha();
	}

}