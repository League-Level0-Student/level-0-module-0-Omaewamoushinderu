import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[] args) {
	String answer = 	JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog (null, "I know that you ate poop last summer, " + answer);
	
}
}
