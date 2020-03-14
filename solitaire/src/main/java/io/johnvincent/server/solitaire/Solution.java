package io.johnvincent.server.solitaire;

import java.io.Serializable;

public class Solution implements Serializable {
	private static final long serialVersionUID = 8537639494609722536L;

	private String line;

	public Solution (String line) {
		this.line = line;
	}

	public String getLine() {return line;}

	public void setLine (String line) {this.line = line;}

	public String toString() {
		return "("+getLine()+")";
	}
}
