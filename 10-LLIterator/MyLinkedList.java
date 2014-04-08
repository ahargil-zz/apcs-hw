import java.util.*;
import java.io.*;

public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private Node<E> tail;

    private class MyLLIterator<E> implements Iterator<E> {
	private Node<E> currentNode;

	public MyLLIterator(Node<E> n) {
	    currentNode = n;
	}

	public boolean hasNext() {
	    return currentNode.getNext() != null;
	}
	public E next() {
	    E data = currentNode.getData();
	    currentNode = currentNode.getNext();
	    return data;
	}
	public void remove() {
	}
    }

    public MyLinkedList() {
	head = new Node<E>(null);
	tail = new Node<E>(null);
	head.setNext(tail);
    }

    public Iterator<E> iterator() {
	return new MyLLIterator(head);
    }

    public String toString() {
	String s = "";
	int ctr = 1;
	if(this.size() == 0) {
	    return "";
	}
	else {
	    Node<E> tmp = head.getNext();
	    while(ctr < this.size()) {
		s += tmp + " --> ";
		tmp = tmp.getNext();
		ctr++;
	    }
	    s += tmp;
	    return s;
	}
    }

    // public void add(String s) {
    //	Node tmp = new Node(s);
    //	tmp.setNext(head.getNext()); // you must do this first
    //	head.setNext(tmp);
    //}

    public void add(E s) {
	Node<E> tmp = head;
	int ctr = 0;
        while(ctr < this.size()) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	Node<E> n = new Node<E>(s);
        n.setNext(tail);
	tmp.setNext(n);
    }

    public void add(int i, E s) { // add @ location i (0 at front).
	int ctr = 0;
	Node<E> tmp1 = head.getNext();
	Node<E> tmp2 = tmp1.getNext();
	while(ctr < i-1) {
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	    ctr++;
	}
	Node<E> add = new Node<E>(s);
	add.setNext(tmp2);
	tmp1.setNext(add);
    }

    public E get(int i) { // returns the string @ location i
	int ctr = 0;
	Node<E> tmp = head.getNext();
	while(ctr < i) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	return tmp.getData();
    }

    public E set(int i, E s) { // sets loc i to s and returns old val
	int ctr = 0;
	Node<E> tmp = head.getNext();
	while(ctr < i) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	E old = tmp.getData();
        tmp.setData(s);
	return old;
    }                  

    public E remove(int i) { // removes item @ loc i and returns old val
	int ctr = 0;
	Node<E> tmp1 = head.getNext();
	Node<E> tmp2 = tmp1.getNext();
	while(ctr < i-1) {
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	    ctr++;
	}
        E old = tmp2.getData();
	tmp1.setNext(tmp2.getNext());
	return old;
    }                     

    public int find(E s) { //returns loc of item w/ val s or if not found
	int ctr = 0;
	Node<E> tmp = head.getNext();
	while(ctr < this.size()) {
	    if(tmp.getData().equals(s)) {
		return ctr;
	    }
	    ctr++;
	    tmp = tmp.getNext();
	}
	return -1;
    }

    public int size() {
	int ctr = 0;
	Node<E> tmp = head.getNext();
	while(tmp != tail) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	return ctr;
    }
}
