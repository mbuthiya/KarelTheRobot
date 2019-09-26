

import stanford.karel.*;
public class Maze extends SuperKarel {
	
	public void run() {
		while(noBeepersPresent()) {
			turnRight();
			while(frontIsBlocked()) {
				turnLeft();
			}
			move();
			
		}
	}

}
