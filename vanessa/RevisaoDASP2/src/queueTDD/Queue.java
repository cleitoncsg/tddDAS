package queueTDD;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer> elements;

	public Queue() {
		elements=new ArrayList<Integer>();
	}
	
	public int count() {
		return elements.size();
	}

	public void pushBack(int element) {
		elements.add(element);		
	}
	
	public int front() {
		return elements.get(0);
	}
	
	public int back() {
		return elements.get(elements.size()-1);
	}

	public int popBack() {
		int removedElement = this.front();
		elements.remove(0);
		return removedElement;		
	}
}
