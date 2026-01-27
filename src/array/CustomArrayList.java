package array;

class CustomArrayList {

    private int[] data;     // internal array
    private int size;       // number of elements

    // Default constructor
    public CustomArrayList() {
        data = new int[10]; // default capacity
        size = 0;
    }

    // Add element at end
    public void add(int element) {
        ensureCapacity();
        data[size++] = element;
    }

    // Add element at specific index
    public void add(int index, int element) {
        checkIndexForAdd(index);
        ensureCapacity();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        size++;
    }

    // Get element by index
    public int get(int index) {
        checkIndex(index);
        return data[index];
    }

    // Remove element by index
    public int remove(int index) {
        checkIndex(index);
        int removed = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return removed;
    }

    // Current size
    public int size() {
        return size;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Resize array when full
    private void ensureCapacity() {
        if (size == data.length) {
            int[] newArray = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
        }
    }

    // Index validation
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    // Display elements
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);

        list.display(); // [10, 15, 20, 30]

        list.remove(2);
        list.display(); // [10, 15, 30]

        System.out.println(list.get(1)); // 15
        System.out.println("Size: " + list.size()); // 3
    }
}
