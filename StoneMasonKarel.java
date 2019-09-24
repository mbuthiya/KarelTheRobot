/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
//		Start position
		turnLeft();
		
//		First Column
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		
//		Move to next Column
		turnRight();
		moves(4);
		turnRight();
		
//		Second column
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
// Moves to the next Column
		turnLeft();
		moves(4);
		turnLeft();
		
//		Third Column
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
// Moves to the next Column
		turnRight();
		moves(4);
		turnRight();
		
//		Fourth Column
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		fillColumnSpace();
		moves(1);
		
//		Final Position
		turnLeft();
		
		
	}
	
	
	
	public void fillColumnSpace() {
		if(noBeepersPresent()) {
			putBeeper();
		}
		
	}
	

	
	public void moves(int steps) {
		if(frontIsClear()) {
			for(int i = 0; i<steps; i++) {
				move();
			}
		}
	
	}

}
