package trabajo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ventana {
public static void main(String[] args) {

		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setText("Hola soy una Label");
		frame.add(label);
		frame.setTitle("Mi segunda ventana");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);



	}
}