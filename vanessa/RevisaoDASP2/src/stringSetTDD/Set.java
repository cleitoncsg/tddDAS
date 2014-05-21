package stringSetTDD;

import java.util.ArrayList;
import java.util.Iterator;

public class Set {
	
	private ArrayList<String> text;
	
	public Set(){
		text = new ArrayList<String>();
	}

	public int count() {
		return text.size();
	}

	public void add(String string) {
		text.add(string);		
	}

	public boolean contains(String string) {
		return text.contains(string);
	}

	public void remove(String string) {
		text.remove(string);
	}
	
	public String toString() {
		String string="";
		Iterator<String> iterator =  text.iterator();
		
		while(iterator.hasNext()){
			string +=iterator.next();
		}		
		return string;
	}

	public void union(Set otherSet) {
		this.add(otherSet.toString());
	}

	public boolean intersection(Set otherSet) {
		Iterator<String> iterator = otherSet.getText().iterator();
		
		while(iterator.hasNext()){
			if(this.contains(iterator.next())) return true;
		}
		return false;
	}

	public ArrayList<String> getText() {
		return text;
	}

	public void clear() {
		text.clear();		
	}
}
