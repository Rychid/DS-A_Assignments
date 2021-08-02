public class Action {

    public static void main(String[] args) {

        int[] elements = {1,2,3};
        SinglyLinkedList sLL = new SinglyLinkedList();
//        sLL.addLast(52);
//        sLL.addLast(88);
//        sLL.addFirst(26);
//        sLL.addFirst(555);
        sLL.insertAt(1, 3);
        sLL.insertAt(2, 5);
        sLL.insertAt(3, 7);
        sLL.insertAt(4, 9);
        sLL.insertAt(5, 11);
        sLL.insertAt(6, 13);
        //sLL.insertAt(3, 15);
//        sLL.getFirst();
//        sLL.getLast();
          sLL.getIndex(7);
//        System.out.println("Value of deleted node is: " + sLL.delFirst().data);
//        System.out.println("Value of last node deleted node is: " + sLL.delLast().data);
//        sLL.clr();
        //sLL.deleteAt(4);
        sLL.get(10);

        sLL.getAll();
        sLL.getSize();
        sLL.addAll(elements);



    }

}
