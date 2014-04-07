public class RPN {

    MyStack s = new MyStack();
    int x;
    int y;

    public void clear() {
	while(!s.isEmpty()) {
	    s.pop();
	}
    }

    public void calc(String a) {
	if(a.equals("+")) {
	    x = Integer.parseInt(s.pop());
	    y = Integer.parseInt(s.pop());
	    s.push(("" + (x+y)));
	}
	else if(a.equals("-")) {
	    x = Integer.parseInt(s.pop());
	    y = Integer.parseInt(s.pop());
	    s.push(("" + (x-y)));
	}
	else if(a.equals("*")) {
	    x = Integer.parseInt(s.pop());
	    y = Integer.parseInt(s.pop());
	    s.push(("" + (x*y)));
	}
	else if(a.equals("/")) {
	    x = Integer.parseInt(s.pop());
	    y = Integer.parseInt(s.pop());
	    s.push(("" + (x/y)));
	}
	else {
	    s.push(a);
	}
	//return s.peek();
    }
}

