import javax.swing.JOptionPane;

public class Stalker {
	public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("what is your full name");
	
		
		String birthday=	JOptionPane.showInputDialog("when is your birthday");
				
				String credit_card_pin= JOptionPane.showInputDialog("What's your credit card pin?");
						
					String address=	JOptionPane.showInputDialog("what is your address");
				String phone_number=	JOptionPane.showInputDialog("what's your phone number");
		String money_per_year=		JOptionPane.showInputDialog("how much money do you make a year?");
	String work=	JOptionPane.showInputDialog("where do you work?");
	JOptionPane.showMessageDialog(null, "thanks for giving out so much personal info");
	System.out.println("you shouldnt be giving out such personal info, "+ name);
	
	}

}
