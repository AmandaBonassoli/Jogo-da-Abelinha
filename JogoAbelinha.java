
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

	private static final long serialVersionUID = 1L;

	JLabel bee1 = new JLabel(new ImageIcon("imagem\\bee1.png"));
	JLabel bee2 = new JLabel(new ImageIcon("imagem\\bee2.png"));
	JLabel bee3 = new JLabel(new ImageIcon("imagem\\bee3.png"));
	JLabel bee4 = new JLabel(new ImageIcon("imagem\\bee4.png"));
	JLabel bee5 = new JLabel(new ImageIcon("imagem\\bee5.png"));

	public JogoAbelinha() {
		editarJanela();
		new Movimento().start();
	}

	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400, 350);
		setLocationRelativeTo(null); // deixa a janela no centro
		setVisible(true);
		setLayout(null);
		bee1.setBounds(0, 0, 200, 100);
		add(bee1);
		bee2.setBounds(100, 0, 200, 100);
		add(bee2);
		bee3.setBounds(200, 0, 200, 100);
		add(bee3);
		bee4.setBounds(300, 0, 200, 100);
		add(bee4);
		bee5.setBounds(400, 0, 200, 100);
		add(bee5);

	}

	public class Movimento extends Thread {
		public void run() {

			while (true) {
				for (int i = 0; i <= 1200; i++) {
					try {
						sleep(5);
					} catch (Exception erro) {

					}

					if (bee1.getX() <= 800) {
						bee1.setBounds(bee1.getX() + 1, 0, 200, 100);

					}
					if (bee2.getX() <= 900) {
						bee2.setBounds(bee2.getX() + 1, 0, 200, 100);

					}
					if (bee3.getX() <= 1000) {
						bee3.setBounds(bee3.getX() + 1, 0, 200, 100);
					}
					if (bee4.getX() <= 1100) {
						bee4.setBounds(bee4.getX() + 1, 0, 200, 100);
					}
					if (bee5.getX() <= 1200) {
						bee5.setBounds(bee5.getX() + 1, 0, 200, 100);

					}
				}
				for (int i = 1200; i >= 0; i--) {
					try {
						sleep(5); 
					} catch (Exception erro) {

					}

					if (bee1.getX() >= 0) {
						bee1.setBounds(bee1.getX() - 1, 0, 200, 100);

					}
					if (bee2.getX() >= 100) {
						bee2.setBounds(bee2.getX() - 1, 0, 200, 100);
				
					}
					if (bee3.getX() >= 200) {
						bee3.setBounds(bee3.getX() - 1, 0, 200, 100);
					}
					if (bee4.getX() >= 300) {
						bee4.setBounds(bee4.getX() - 1, 0, 200, 100);

					}if (bee5.getX() >= 400) {
						bee5.setBounds(bee5.getX() - 1, 0, 200, 100);
					}

				}
			}
		}

	}

	public static void main(String[] args) {
		new JogoAbelinha();
	}

}