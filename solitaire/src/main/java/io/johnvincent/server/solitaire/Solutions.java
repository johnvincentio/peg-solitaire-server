package io.johnvincent.server.solitaire;

import java.util.ArrayList;
import java.util.Iterator;

public class Solutions {
	private ArrayList<Solution> m_collection = new ArrayList<Solution>();

	public Solutions() {}

	public void setSolution(Solution item) {add(item);}

	public void add (Solution item) {if (item != null) m_collection.add (item);}
	public Iterator<Solution> getItems() {return m_collection.iterator();}
	public int getSize() {return m_collection.size();}
	public boolean isNone() {return getSize() < 1;}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < m_collection.size(); i++)
			buf.append(((Solution) m_collection.get(i)).toString());
		return "("+buf.toString()+")";
	}
}
