package io.johnvincent.server.solitaire;

public class Move {
	private int row;
	private int column;

	public Move() {}

//	public Move (String row, String column) {
//		this.row = row;
//		this.column = column;
//	}

	public int getRow() {return row;}
	public int getColumn() {return column;}

	public void setRow (int row) {this.row = row;}
	public void setColumn (int column) {this.column = column;}

	public String toString() {
		return "("+getRow()+","+getColumn()+")";
	}
}
