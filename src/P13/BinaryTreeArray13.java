package P13;

public class BinaryTreeArray13 {
    int[] data;
    int idxLast;

    public BinaryTreeArray13 () {
        data = new int[10];
    }

    public void populateData (int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(int data) {
        if (idxLast == 0) {
            this.data[idxLast] = data;
            idxLast++;
            return;
        }

        int idxCurrent = 0;
        while (true) {
            if (data > this.data[idxCurrent]) {
                if (this.data[2 * idxCurrent + 1] != 0) {
                    idxCurrent = 2 * idxCurrent + 1;
                } else {
                    this.data[2 * idxCurrent + 1] = data;
                    break;
                }
            } else {
                if (this.data[2 * idxCurrent + 2] != 0) {
                    idxCurrent = 2 * idxCurrent + 2;
                } else {
                    this.data[2 * idxCurrent + 2] = data;
                    break;
                }
            }
        }
        idxLast++;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
