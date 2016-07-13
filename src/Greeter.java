import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String hi="hello";
			hi= JOptionPane.showInputDialog("what is your name");
			JOptionPane.showMessageDialog(null, "hi "+ hi);
	}

}
