public class Heap {

    private int[] heap;
    private int size;
    
    public Heap() {
	heap = new int[10];
	size = 0;
    }

    public Heap(int[] a) {
	heap = a;
	size = 0;
    }

    public Heap(int a) {
	heap = new int[a];
	size = a.length;
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
    }

}
