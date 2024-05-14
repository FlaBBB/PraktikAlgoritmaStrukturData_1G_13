package P11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node tmp = head;
        System.out.print("Isi Linked List:\t");
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (temp == tail) {
                    tail = ndInput;
                }
                return;
            }
            temp = temp.next;
        } while (temp != null);
    }

    int getLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    void insertAt(int index, int input) {
        Node ndInput = new Node(input, head);

        if (index < 0) {
            int length = getLength();
            index = length + index;

            if (index < 0) {
                System.out.println("Indeks melebihi batas");
                return;
            }
        }

        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi batas");
                return;
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (temp == tail) {
                tail = ndInput;
            }
        } else if (index == 0) {
            addFirst(input);
        }
    }

    int getData(int index) {
        if (isEmpty()) {
            return -1;
        }

        if (index < 0) {
            int length = getLength();
            index = length + index;

            if (index < 0) {
                return -1;
            }
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return -1;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.data;
    }

    int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            if (head.data == key) {
                removeFirst();
            } else if (tail.data == key) {
                removeLast();
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data == key) {
                        temp.next = temp.next.next;
                        return;
                    }
                    temp = temp.next;
                }
            }
        }
    }

    public void removeAt (int index) {
        if (!isEmpty()) {
            if (index < 0) {
                int length = getLength();
                index = length + index;

                if (index < 0) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
            }

            if (index == 0) {
                removeFirst();
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    if (temp == null) {
                        System.out.println("Indeks melebihi batas");
                        return;
                    }
                    temp = temp.next;
                }
                if (temp == null || temp.next == null) {
                    System.out.println("Indeks melebihi batas");
                    return;
                }
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }
}
