import java.util.ArrayList;

public class SinglyLinkedList {
    Node head;

    ArrayList<Node> nodes = new ArrayList();

    int size = 0;


    public int getIndex(int element) {

        try {

            Node curr = this.head;
            int count = 0;
            int found = 0;

            if (curr != null) {
                while (curr != null) {
                    count++;
                    if (curr.data == element) {
                        found++;
                        break;

                    }
                    curr = curr.next;
                }
                if (found == 1) {
                    System.out.println(element + " is found at index " + count + ".");
                } else {
                    System.out.println(element + "is not found in list.");
                }
            } else {
                System.out.println("The list is empty");
            }

        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + ", index not found");
        }
        return element;
    }

    public int get(int index) {
        try {
            Node cur = head;
            int count = 1;
            while (cur != null) {
                if (count == index)
                    System.out.println("data at index " + index + " is " + cur.data);
                count++;
                cur = cur.next;
            }
            return 0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + " index out of bounce");
        }

        return index;
    }

    public void getFirst() {
        Node fNode = new Node();

        if (head == null) {
            head = fNode;
        } else {
            System.out.println("First node is: " + head.data);
        }
    }

    public void getLast() {
        Node lNode = new Node();

        if (head == null) {
            head = lNode;
        } else {
            Node prev = head;
            int count = 1;

            while (count < size - 1) {
                prev = prev.next;
                count++;
            }
            lNode.data = prev.next.data;

            System.out.println("Last node is: " + lNode.data);
        }

    }

    public void addAll(int[] elements) {
        Node node = new Node();
        node.datas = nodes;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            for (int i = 0; i < elements.length; i++) {
                Node n = head;
                while (n.next != null) {
                    n = n.next;
                    size++;
                }
                n.nexts = nodes;
            }

        }
    }

    public void addLast(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;

            }
            n.next = node;
            nodes.add(node);
        }
        size++;
    }

    public void addFirst(int newData) {
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = head;
        head = newNode;

        nodes.add(newNode);
        size++;
    }

    public void insertAt(int index, int data) {
        try {
            Node node = new Node();
            node.data = data;
            if (index == 1) {
                node.next = head;
                head = node;
            } else {
                Node prev = head;
                int count = 1;

                while (count < index - 1) {
                    prev = prev.next;
                    count++;
                }

                Node curr = prev.next;
                prev.next = node;
                node.next = curr;
                nodes.add(node);

            }
            size++;
        } catch (NullPointerException e) {
            System.out.println(e + " Index not found");
        }
    }

    public void getAll() {
        try {
            if (head == null) {
                System.out.println("Linked list is Empty");
            } else {
                Node node = head;

                while (node.next != null) {
                    System.out.print(node.data + " " + "--> ");
                    node = node.next;
                }
                System.out.println(node.data + " " + "--> " + null);
            }
        } catch (NullPointerException e) {
            System.out.println(e + " not found");
        }
    }

    public Node delFirst() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
            return temp;
        }

    }

    public Node delLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        int count = 1;

        while (count < size - 1) {
            temp = temp.next;
            count++;

        }
        temp.next = null;
        size--;
        return temp;
    }

    public void clr() {
        try {
            Node prev = head;
            Node store;

            while (prev != null) {
                store = prev.next;
                delFirst();
                prev = store;
                size = 0;
            }

        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    public void deleteAt(int index) {

        if (index == 1 && head != null) {
            head = head.next;
            size--;
        } else {
            Node prev = head;
            int count = 1;
            for (int i = 1; i < index - 1; i++) {
                if (prev != null && prev.next != null) {
                    Node cur = prev.next;
                    prev.next = prev.next.next;
                    cur = null;
                    size--;
                }
            }
        }

    }


    public void getSize() {
        System.out.println("Size of linked list is " + size);
    }

}
