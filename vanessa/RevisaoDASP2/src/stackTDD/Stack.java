package stackTDD;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> elements;

	public Stack() {
		elements = new ArrayList<Integer>();
	}

	public int count() {
		return elements.size();
	}
	
	public void push(int topElement) {
		elements.add(topElement);
	}
	
	public int top(){
		return elements.get(elements.size()-1);
	}

	public int pop() {		
		int elementRemoved = this.top();
		elements.remove(this.count()-1);
		return elementRemoved;
	}

}
