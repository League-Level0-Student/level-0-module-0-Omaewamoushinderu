import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	String color = 	JOptionPane.showInputDialog("What's your favroite color.");
	JOptionPane.showMessageDialog (null, color  + " is my favorite color too");
	Robot Neko = new Robot();
	Neko.penDown();
	Neko.setSpeed(200);
	Neko.turn(120);
	Neko.move(100);
	Neko.turn(120);
	Neko.move(100);
	Neko.turn(120);
	Neko.move(100);
	Neko.hide();
if (color.equals("black"));{
		Neko.setPenColor(Color.red);
	else {
	Neko.setRandomPenColor();
}
}
