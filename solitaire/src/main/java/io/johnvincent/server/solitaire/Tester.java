package io.johnvincent.server.solitaire;

public class Tester {
	private String status;
	private Move move;

	public Tester() {}
//	public Tester (String status, String from) {
//		this.status = status;
//		this.from = from;
//	}

	public String getStatus() {return status;}
	public Move getFrom() {return move;}

	public void setStatus (String status) {
		System.out.println("set status "+status);
		this.status = status;
	}
	public void setFrom (Move move) {
		System.out.println("set from "+move);
		this.move = move;
	}

	public String toString() {
		return "("+getStatus()+","+getFrom()+")";
	}
}
