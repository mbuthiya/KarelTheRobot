/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		while(frontIsClear()) {
			fillStreet();
			makeTurn();
			
		}
	
	}
	
	public void fillStreet() {
		
		while(frontIsClear()) {
			checkBox();
			move();
			
		}
		checkBox();
		
		
	}
	
	public void checkBox() {
		turnAround();
		if(frontIsBlocked()) {
			putBeeper();
			turnAround();
		}else {
			move();
			if(noBeepersPresent()) {
				turnAround();
				move();
				putBeeper();
			}else {
				turnAround();
				move();
			}
		}
	}


public void makeTurn() {
	
	if(facingEast()) {
		faceNorth();
		if(frontIsClear()) {
			move();
			faceWest();
		}
		
	}else {
		faceNorth();
		
		if(frontIsClear()) {
			move();
			faceEast();
		}
		
	}
}

public void faceNorth() {
	while(notFacingNorth()) {
		turnLeft();
	}
}

public void faceWest() {
	while(notFacingWest()) {
		turnLeft();
	}
}

public void faceEast() {
	while(notFacingEast()) {
		turnLeft();
	}
}
	
	
	
	

}
