package P8;

/**
 * StackKonversi
 */
public class StackKonversi {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi() {
        this.size = 32;
        this.tumpukanBiner = new int[this.size];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push (int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
            return;
        }

        tumpukanBiner[++this.top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        }

        return this.tumpukanBiner[top--];
    }
}