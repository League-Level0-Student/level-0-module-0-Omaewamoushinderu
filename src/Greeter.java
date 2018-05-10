import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = 	JOptionPane.showInputDialog("What is your name?");
	String who = 	JOptionPane.showInputDialog("Nice to meet you " + answer + ", My name is Ayden." );
	
}
}
