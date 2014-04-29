public class BST {

    private Node root;

    public BST() {
	root = null;
    }

    private void insert(int data) {
	Node n = new Node(data);
	if(root == null) {
	    root = n;
	}
	else {
	    Node tmp1 = root;
	    Node tmp2 = root;
	    while(tmp2 != null) {
		tmp1 = tmp2;
		if(data > tmp1.getData()) {
		    tmp2 = tmp1.getRight();
		}
		else {
		    tmp2 = tmp1.getLeft();
		}
	    }
	    if(data > tmp1.getData()) {
		tmp1.setRight(new Node(data));
	    }
	    else {
		tmp1.setLeft(new Node(data));
	    }
	}
    }

    public Node search(int x) {
	Node tmp = root;
	while(tmp != null) {
	    if(tmp.getData() == x) {
		return tmp;
	    }
	    if(tmp.getData() > x) {
		tmp = tmp.getLeft();
	    }
	    else {
		tmp = tmp.getRight();
	    }
	}
	return null;
    }

    public Node search2(Node c, int x) {
        if(x == c.getData()) {
	    return c;
	}
	else if(x > c.getData() && c.getRight() != null) {
	    return search2(c.getRight(), x);
	}
	else if(x < c.getData() && c.getLeft() != null) {
	    return search2(c.getLeft(), x);
	}
	else {
	    return null;
	}
    }

    public void delete(int x) {
	Node del = root;
	Node pig = null;
	while(x != del.getData()) {
	    if(x > del.getData()) {
		pig = del;
		del = del.getRight();
	    }
	    else {
		pig = del;
		del = del.getLeft();
	    }
	}
	if(del.getRight() == null && pig.getLeft() == del) {
	    pig.setLeft(del.getLeft());
	}
	else if(del.getRight() == null && pig.getRight() == del) {
	    pig.setRight(del.getRight());
	}
	else if(del.getLeft() == null && pig.getLeft() == del) {
	    pig.setLeft(del.getRight());
	}
	else if(del.getLeft() == null && pig.getRight() == del) {
	    pig.setRight(del.getLeft());
	}
	else {
	    pig = del;
	    Node l = pig.getLeft();
	    while(l != null) {
		pig = l;
		l = l.getRight();
	    }
	    delete(pig.getData());
	    del.setData(pig.getData());
	}
    }

    public static void main(String[] args) {
	BST t = new BST();
	t.insert(10);
	t.insert(13);
	t.insert(7);
	t.insert(12);
	t.insert(27);
	t.insert(30);
	t.insert(11);
	t.insert(19);
	t.insert(3);
	t.insert(1);
	/*
	System.out.println(t.search(10));
	System.out.println(t.search(13));
	System.out.println(t.search(7));
	System.out.println(t.search(12));
	System.out.println(t.search(27));	
	System.out.println(t.search(30));	
	System.out.println(t.search(11));
	System.out.println(t.search(19));
	System.out.println(t.search(3));
	System.out.println(t.search(1));
	System.out.println(t.search(4));
	*/
	System.out.println(t.search2(t.root, 10));
	System.out.println(t.search2(t.root, 13));
	System.out.println(t.search2(t.root, 7));
	System.out.println(t.search2(t.root, 12));
	System.out.println(t.search2(t.root, 27));	
	System.out.println(t.search2(t.root, 30));	
	System.out.println(t.search2(t.root, 11));
	System.out.println(t.search2(t.root, 19));
	System.out.println(t.search2(t.root, 3));
	System.out.println(t.search2(t.root, 1));
	System.out.println(t.search2(t.root, 4));
	t.delete(19);
	t.delete(30);
	t.delete(13);
	System.out.println(t.search2(t.root, 10));
	System.out.println(t.search2(t.root, 13));
	System.out.println(t.search2(t.root, 7));
	System.out.println(t.search2(t.root, 12));
	System.out.println(t.search2(t.root, 27));	
	System.out.println(t.search2(t.root, 30));	
	System.out.println(t.search2(t.root, 11));
	System.out.println(t.search2(t.root, 19));
	System.out.println(t.search2(t.root, 3));
	System.out.println(t.search2(t.root, 1));
	System.out.println(t.search2(t.root, 4));
    }
       	
}
