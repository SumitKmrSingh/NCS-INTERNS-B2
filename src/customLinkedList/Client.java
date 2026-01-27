package customLinkedList;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

//        linkedList.search(10);
//
//        linkedList.insertAtFirst(10);
//        linkedList.display();               // 10 -> null
//        linkedList.insertAtFirst(20);   // 20 -> 10 -> null
//        linkedList.display();
//        linkedList.insertAtEnd(30);
//        linkedList.insertAtEnd(40);
//
//        linkedList.display();               // 20 -> 10 -> 30 -> 40 -> null
//        linkedList.insertAtSpecificPosition(50, 3);
//        linkedList.display();             //  20 -> 10 -> 30 -> 50 -> 40 -> null
//
//        linkedList.deleteAtFirst();
//        linkedList.display();       //  10 -> 30 -> 50 -> 40 -> null
//
//        linkedList.deleteFromEnd();
//        linkedList.display();       // 10 -> 30 -> 50 -> null
//
//        linkedList.search(20);
//        linkedList.search(10);


        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(18);
        linkedList.insertAtEnd(21);
        linkedList.insertAtEnd(17);
        linkedList.insertAtEnd(11);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(59);
        linkedList.insertAtEnd(14);

        linkedList.display();           // 2 -> 3 -> 6 -> 18 -> 21 -> 17 -> 11 -> 7 -> 59 -> 14 -> null

        int totalPrime = linkedList.getTotalPrime();
        System.out.println("Total Prime In Linked List : "+totalPrime);
    }
}
