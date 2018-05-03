import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	//Make a new robot
Robot Neko = new Robot();
	//penDown
Neko.penDown();
Neko.setSpeed(20);
Neko.turn(150);
Neko.move(100);
Neko.turn(180);
Neko.move(50);
Neko.turn(300);
Neko.move(50);
Neko.turn(120);
Neko.move(50);
Neko.turn(180);
Neko.move(100);
Neko.hide();
}
}