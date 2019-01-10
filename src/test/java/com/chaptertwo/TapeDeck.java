package com.chaptertwo;

class TapeDeck {

	boolean canRecord = false;

	void playTape() {
		System.out.println("tape playing");
	}

	void recordTape() {
		System.out.println("tape recording");
	}

}

class TapeDeckTestDrive {

	public static void main(String [] args) {
		
		TapeDeck t = new TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
	}
}

class DVDPlayer {

	boolean canRecord = false;
	
	void recordDVD() {
		System.out.println("DVD recording");
	}
	
	void playDVD() {
		System.out.println("DVD Playing");
	}

}

class DVDPlayerTestDrive {
	
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		
		d.canRecord = true;
		d.playDVD();
		
		if(d.canRecord == true) {
			d.recordDVD();
		}
		
	}
}
