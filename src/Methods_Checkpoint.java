import org.jointheleague.graphical.robot.Robot;

public class Methods_Checkpoint {
	public static void main(String[] args) {
		Robot rob = new Robot();
		food("apple");
		truth(3);
		for (int i=0; i<4; i++) {
			drawline();
		}
		jump(6);
		jumped("piggy");
	}
	void food(String fruit) {
	       System.out.println("I like " + fruit);
	}
	void truth(int x) {
	       if(x > 5)
	             System.out.println("Geeks rule");
	       else
	              System.out.println("Nerds rule");

	}
	void drawLine() {
	      rob.move(100);
	      rob.turn(90);
	}
	void jump(int height) {
	       if (height > 100)
	             System.out.println("The mouse jumped over the moon.");
	       if (height > 50)
	              System.out.println("The mouse jumped over the broom.");
	       if (height > 5)
	              System.out.println("The mouse jumped over the candlestick.");
	}
	void jumped(String obstacle) {

        System.out.println("The mouse jumped over the " + obstacle);
 }

}
