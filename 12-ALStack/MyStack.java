public class MyStack {
    private String[] _stack;
    private int numEl;

    //constructor 1
    public MyStack() {
	_stack = new String[10];
	numEl = 0;
    }

    public MyStack(int n) {
	_stack = new String[n];
	numEl = 0;
    }
    //push 2
    public void push(String s) {
	if(numEl >= _stack.length) {
	    String[] stack2 = new String[(_stack.length)*2];
	    for(int x = 1; x < numEl; x++) {
		stack2[x] = _stack[x-1];
	    }
	    stack2[0] = s;
	    _stack = stack2;
	}
	else {
	    if(this.isEmpty()) {
		_stack[0] = s;
	    }
	    else {
		for(int x = numEl; x > 0; x--) {
		    _stack[x] = _stack[x-1];
		}
		_stack[0] = s;
	    }
	}
	numEl += 1;
    }
    //pop
    public String pop() {
	String s = _stack[0];
	for(int x = 0; x < numEl; x++) {
	    _stack[x] = _stack[x+1];
	}
	numEl -= 1;
	return s;
    }
    //peek
    public String peek() {
	return _stack[0];
    }
    //isEmpty
    public boolean isEmpty() {
	return _stack[0] == null;
    }

    //toString
    public String toString() {
	String s = "[";
	for(int x = 0; x < numEl-1; x++) {
	    s += _stack[x] + ", ";
	}
	s += _stack[numEl-1] + "]";
	return s;
    }
}
