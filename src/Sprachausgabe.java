import javax.swing.JOptionPane;

import com.sun.speech.freetts.*;

public class Sprachausgabe {

	public static void main(String[] args) {
		
	}

	public static void spak(int a, String s) {
		VoiceManager voiceManager = VoiceManager.getInstance();
		Voice voice = voiceManager.getVoice("kevin");
		voice.allocate();
		voice.speak(a + s);
		voice.deallocate();
	}

	
}
