package day5;
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	static AudioClip audioClip;
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "we will play the start of a song, and you have to guess the title and author of the song!");

		// 5. Use the playSound method to play your song.
		playSound("skyfall.wav"); 
		
		// 6. Make a pop-up for the player to type their answer.
		String answer= JOptionPane.showInputDialog("type your answer here");
		audioClip.stop();
		
	

		// 7. If they answered correctly, tell them that they were right.
		if(answer.equals("Skyfall by Adele")){
			speak("Correct!!! Good Job!");
		}

		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else{
			speak("wrong!");
		}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
	    audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


