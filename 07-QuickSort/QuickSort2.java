import java.util.*;

public class QuickSort2 {

    public static Integer[] quicksort(Integer[] a) {
	if(a.length <= 1) {
	    return a;
	}
	else {
	    int low = 0;
	    int high = a.length - 1;
	    return partition(a, low, high);
	}
    }

    public static int partition(Integer[] a, int L, int R) {
	int p = L + (int)(Math.random()*(R - L + 1));
	int t = a[p];
	a[p] = a[R];
	a[R] = t;
	int wall = L;
	for(int x = L; x < R; x++) {
	    if(a[x] < a[R]) {
		t = a[x];
		a[x] = a[wall];
		a[wall] = t;
		wall++;
	    }
	}
	t = a[wall];
	a[wall] = a[R];
	a[R] = t;
	return wall;
    }

    public static void main(String[] args) {
	Integer[] a = {3, 7, 9, 0, 10, 2, 8, 1, 13, 27, 20, 17, 15, 4, 5};
	Integer[] b = quicksort(a);
	for(int x = 0; x < b.length; x++) {
	    System.out.print(b[x] + ", ");
	}
    }

}
