package io.johnvincent.server.solitaire;

public class Tester {
	private String status;
	private int type;
	private Move move;

	public Tester() {}
//	public Tester (String status, String from) {
//		this.status = status;
//		this.from = from;
//	}

	public String getStatus() {return status;}
	public int getType() {return type;}
	public Move getFrom() {return move;}

	public void setStatus (String status) {
		System.out.println("set status "+status);
		this.status = status;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setFrom (Move move) {
		System.out.println("set from "+move);
		this.move = move;
	}

	public String toString() {
		return "("+getStatus()+", "+getType()+", "+getFrom()+")";
	}
}
