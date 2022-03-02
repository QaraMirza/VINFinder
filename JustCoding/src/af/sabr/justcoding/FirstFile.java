package af.sabr.justcoding;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstFile {

	public static void main(String[] args) throws IOException {
		AutoGUI agui = new AutoGUI("Program");
		agui.setVisible(true);
		agui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		agui.setSize(300,200);
		agui.setResizable(false);
		agui.setLocationRelativeTo(null);
	}

}
