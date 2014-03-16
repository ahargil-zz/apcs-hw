import java.util.*;

public class QuickSort {

    public static Integer[] quicksort(Integer[] a) {
	if(a.length <= 1) {
	    return a;
	}
	else {
	    int low = 0;
	    int high = a.length - 1;
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    int p = low + (int)(Math.random()*(high - low + 1));
	    for(int x = 0; x < a.length; x++) {
		if(a[x] < a[p]) {
		    lower.add(a[x]);
		}
		else if(a[x] > a[p]) {
		    upper.add(a[x]);
		}
	    }
	    Integer[] u = upper.toArray(new Integer[]{});
	    Integer[] l = lower.toArray(new Integer[]{});
	    u = quicksort(u);
	    l = quicksort(l);
	    int x = 0;
	    p = a[p];
      	    for(; x < l.length; x++) {
		a[x] = l[x];
	    }
	    a[x] = p;
	    x = 0;
	    for(; x < u.length; x++) {
		a[x+l.length+1] = u[x];
	    }
	    return a;
	}
    }

    public static void main(String[] args) {
	Integer[] a = {3, 7, 9, 0, 10, 2, 8, 1, 13, 27, 20, 17, 15, 4, 5};
	Integer[] b = quicksort(a);
	for(int x = 0; x < b.length; x++) {
	    System.out.print(b[x] + ", ");
	}
    }

}
