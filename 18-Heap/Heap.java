public class Heap {

    private int[] heap;
    private int size;
    
    public Heap() {
	heap = new int[10];
	size = 0;
    }

    public Heap(int[] a) {
	heap = a;
	size = a.length - 1;
    }

    public Heap(int a) {
	heap = new int[a];
	size = 0;
    }

    private void insert(int n) {
	int x = size + 1;
	heap[x] = n;
	while(x > 1 && heap[x] >= heap[x/2]) {
	    int tmp = heap[x];
	    heap[x] = heap[x/2];
	    heap[x/2] = tmp;
	    x = x/2;
	}
	size++;
    }

    private int getMax() {
	return heap[1];
    }

    private int getSize() {
	return size;
    }

    private void sort() {
	int[] a = this.heap;
	heap = new int[a.length];
	size = 0;
	for(int x = 1; x < a.length; x++) {
	    this.insert(a[x]);
	}
    }
	

    public static void main(String[] args) {
	Heap h = new Heap();
	h.insert(8);
	h.insert(3);
	h.insert(12);
	h.insert(6);
	h.insert(20);
	h.insert(15);
	h.insert(9);
	for(int x = 1; x <= h.getSize(); x++) {
	    System.out.print(h.heap[x] + ", ");
	}
	System.out.println();
	int[] a = new int[10];
	a[0] = 0;
	a[1] = 10;
	a[2] = 20;
	a[3] = 30;
	a[4] = 40;
	a[5] = 50;
	a[6] = 60;
	a[7] = 70;
	a[8] = 80;
	a[9] = 90;
	Heap n = new Heap(a);
	for(int x = 1; x <= n.getSize(); x++) {
	    System.out.print(n.heap[x] + ", ");
	}
	System.out.println();
	n.sort();
	for(int x = 1; x <= n.getSize(); x++) {
	    System.out.print(n.heap[x] + ", ");
	}
    }

}
