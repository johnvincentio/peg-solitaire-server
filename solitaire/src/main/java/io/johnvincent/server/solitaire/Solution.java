package io.johnvincent.server.solitaire;

public class Solution {
	private String status;
	private int type;
	private Move from;
	private Move via;
	private Move to;

	public Solution() {}

	public String getStatus() {return status;}
	public int getType() {return type;}
	public Move getFrom() {return from;}
	public Move getVia() {return via;}
	public Move getTo() {return to;}

	public void setStatus (String status) {
		System.out.println("set status "+status);
		this.status = status;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setFrom (Move from) {
		System.out.println("set from "+from);
		this.from = from;
	}
	public void setVia (Move via) {
		System.out.println("set via "+via);
		this.via = via;
	}
	public void setTo (Move to) {
		System.out.println("set to "+to);
		this.to = to;
	}

	public String toString() {
		return "("+getStatus()+", "+getType()+", "+getFrom()+", "+getVia()+", "+getTo()+")";
	}
}
