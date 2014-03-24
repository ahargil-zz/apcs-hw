public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
	head = new Node("dummy");
	tail = new Node("dummytail");
	head.setNext(tail);
    }

    public String toString() {
	String s = "";
	int ctr = 1;
	if(this.size() == 0) {
	    return "";
	}
	else {
	    Node tmp = head.getNext();
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

    public void add(String s) {
	Node tmp = head;
	int ctr = 0;
        while(ctr < this.size()) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	Node n = new Node(s);
        n.setNext(tail);
	tmp.setNext(n);
    }

    public void add(int i, String s) { // add @ location i (0 at front).
	int ctr = 0;
	Node tmp1 = head.getNext();
	Node tmp2 = tmp1.getNext();
	while(ctr < i-1) {
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	    ctr++;
	}
	Node add = new Node(s);
	add.setNext(tmp2);
	tmp1.setNext(add);
    }

    public String get(int i) { // returns the string @ location i
	int ctr = 0;
	Node tmp = head.getNext();
	while(ctr < i) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	return tmp.getData();
    }

    public String set(int i, String s) { // sets loc i to s and returns old val
	int ctr = 0;
	Node tmp = head.getNext();
	while(ctr < i) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	String old = tmp.getData();
        tmp.setData(s);
	return old;
    }                  

    public String remove(int i) { // removes item @ loc i and returns old val
	int ctr = 0;
	Node tmp1 = head.getNext();
	Node tmp2 = tmp1.getNext();
	while(ctr < i-1) {
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	    ctr++;
	}
        String old = tmp2.getData();
	tmp1.setNext(tmp2.getNext());
	return old;
    }                     

    public int find(String s) { //returns loc of item w/ val s or if not found
	int ctr = 0;
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
	while(tmp != tail) {
	    tmp = tmp.getNext();
	    ctr++;
	}
	return ctr;
    }
}
