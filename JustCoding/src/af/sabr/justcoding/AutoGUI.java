package af.sabr.justcoding;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class AutoGUI extends JFrame{
	JTextField field;
	JButton button;
	JLabel label;
	String word;
	eHandler handler = new eHandler();
	
	public AutoGUI(String number) {
		super(number);
		setLayout(new FlowLayout());
		
		field = new JTextField(20);
		button = new JButton("Проверить");
		label = new JLabel("");
		
		add(field);
		add(button);
		add(label);
		
		button.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				word = field.getText();
				try {
					AutoCheck check = new AutoCheck();
					String answer = check.getAnswer(word);
					label.setText("                             " + answer + "                             ");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
