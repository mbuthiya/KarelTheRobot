/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	public void run() {
//		Going out to collect beeper
		findPaper();
//		Collecting beeper
		collectPaper();
//		Going back to original position
		backToOriginal();
//		Turning to original position
		turnAround();
		
		
	}
	
	public void findPaper() {
		moves(2);
		turnRight();
		moves(1);
		turnLeft();
	}
	
	public void collectPaper() {
		moves(1);
		pickBeeper();
		turnAround();
	}
	
	public void backToOriginal() {
		moves(1);
		turnRight();
		moves(1);
		turnLeft();
		moves(2);
	}
	
	public void moves(int steps) {
		for(int i = 0; i<steps; i++) {
			move();
		}
	}

}
