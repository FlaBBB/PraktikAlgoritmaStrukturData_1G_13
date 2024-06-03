package P13;

public class Node13 {
    int data;
    Node13 left, right;

    public Node13(){};

    public Node13(Node13 left, int data, Node13 right) {
        this.data = data;
        this.left = left;
        this.right = right;       
    }
}
