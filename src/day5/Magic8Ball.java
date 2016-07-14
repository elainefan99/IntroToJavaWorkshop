package day5;
	import java.util.Random;

import javax.swing.JOptionPane;

	public class Magic8Ball {

		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);
		// 3. Print out this variable
JOptionPane.showMessageDialog(null, random);
		// 4. Get the user to enter a question for the 8 ball
String question= JOptionPane.showInputDialog("Ask your question here");
		// 5. If the random number is 0
if(random==0){
	JOptionPane.showMessageDialog(null, "yes");

}
		// -- tell the user "Yes"

		// 6. If the random number is 1
if(random==1){
	JOptionPane.showMessageDialog(null, "no");
}

		// -- tell the user "No"
if(random==2){
	JOptionPane.showMessageDialog(null, "Maybe you should ask Cortana? (She isn't as smart as me though! ;)");
}
		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Cortana?"
if(random==3){
	JOptionPane.showMessageDialog(null, "Ummmm.... uhhhhh.... I  I I Gotta consult with my Master Google. Uhhhhh BYE!!!");
}
		// 8. If the random number is 3

		// -- write your own answer

	}
	}




