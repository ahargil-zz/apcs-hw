import java.util.*;

public class TimeTest{

    public static void main(String[] args) {
	long n;
	HashMap<Integer, Integer> h = new HashMap();
	TreeMap<Integer, Integer> t = new TreeMap();

	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    h.put(x, x);
	}
	System.out.println("put for HashMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    t.put(x, x);
	}
	System.out.println("put for TreeMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    h.containsKey(x);
	}
	System.out.println("containsKey for HashMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    t.containsKey(x);
	}
	System.out.println("containsKey for TreeMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    h.containsValue(x);
	}
	System.out.println("containsValue for HashMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    t.containsValue(x);
	}
	System.out.println("containsValue for TreeMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    h.get(x);
	}
	System.out.println("get for HashMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    t.get(x);
	}
	System.out.println("get for TreeMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    h.remove(x);
	}
	System.out.println("remove for HashMap: " + (System.nanoTime() - n));
	n = System.nanoTime();
	for(int x = 0; x < 50000; x++) {
	    t.remove(x);
	}
	System.out.println("remove for TreeMap: " + (System.nanoTime() - n));	
    }
}

    
