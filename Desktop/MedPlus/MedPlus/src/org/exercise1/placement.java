package org.exercise1;
public class placement extends student {
	private int attended;
	private int placed;
	public placement(int attended, int placed) {
		super();
		this.attended = attended;
		this.placed = placed;
	}
	public int getAttended() {
		return attended;
	}
	public void setAttended(int attended) {
		this.attended = attended;
	}
	public int getPlaced() {
		return placed;
	}
	public void setPlaced(int placed) {
		this.placed = placed;
	}

}
