package P14;

public class Node13 {
    int data;
    Node13 prev, next;
    int jarak;
    
    Node13(Node13 prev, int data, int jarak, Node13 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
