import java.util.*;

public class QuickSort3 { 

    public static void quicksort(int[] a) {
    	quicksort(a, 0, (a.length)-1);
    }

    public static void quicksort(int[] a, int L, int R) {
	if(L > R) {
	    return;
	}
	else {
	    int p = partition(a, L, R);
	    quicksort(a, L, p-1);
	    quicksort(a, p+1, R);
	}
    }

    public static int partition(int[] a, int L, int R) {
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
	int rwall = wall;
	for(int x = wall; x < R; x++) {
	    if(a[x] == a[p]) {
		t = a[rwall];
		a[rwall] = a[x];
		a[x] = t;
		rwall++;
	    }
	}
	t = a[wall];
	a[wall] = a[R];
	a[R] = t;
	return wall;
    }


    public static void main(String[] args) {
	int[] m = new int[15000];
	for(int x = 0; x < m.length; x++) {
	    m[x] = (int)(Math.random() * 2);
	}
        quicksort(m);
	System.out.println(Arrays.toString(m));
    }

}
