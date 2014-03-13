import java.util.*;

public class QuickSelect {
   
    public static int quickselect(int[] a, int k, int low, int high) {
	if(low >= high) {
	    return a[low];
	}
	int j = partition(a, low, high);
	if(j == k) {
	    return a[k];
	}
        if(j < k) {
	    return quickselect(a, k, j+1, high);
	}
	else {
	    return quickselect(a, k, low, j-1);
	}
    }

    public static int partition(int[] a, int low, int high) {
        int p = low + new Random().nextInt(high - low + 1);
	int t = a[high];
	a[high] = a[p];
	a[p] = t;
        int track = low;
        for (int i = track; i < high; i++) {
            if (a[i] < a[high]) {
		t = a[i];
		a[i] = a[track];
		a[track] = t;
                track++;
            }
        }
	t = a[track];
	a[track] = a[high];
	a[high] = t;
        return track;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
	int[] a = {7, 8, 2, 5, 0, 9, 13, 35, 6, 3, 24, 1};
	System.out.println(quickselect(a, 10, 0, a.length -1));
    }

}

