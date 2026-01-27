package customLinkedList;

public class LinkedList {
    Node head = null;

    // insertAtFirst
    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        return;
    }

    // insertAtEnd
    public void insertAtEnd(int data){
        Node node = new Node(data);
        if (head == null){
            insertAtFirst(data);
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    // insertAtSpecificPosition
    public void insertAtSpecificPosition(int data, int position){
        if (position == 0){
            insertAtFirst(data);
            return;
        }
        Node node = new Node(data);

        Node temp = head;
        for (int i=0; i<position-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    // deleteAtFirst
    public void deleteAtFirst(){
        // list is empty
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // deleteFromEnd
    public void deleteFromEnd(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        // If list has only one node
        if (head.next == null){
            head = null;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // search
    public void search(int key){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                System.out.println(key+" Present in list");
                return;
            }
            temp = temp.next;
        }
        System.out.println(key+" not present in list");
    }

    // Write a program to count the number of prime elements in a linked list.
    public int getTotalPrime(){
        if (head == null){
            System.out.println("List is empty");
            return 0;
        }

        Node temp = head;
        int countPrime=0;
        while (temp != null){
            int data = temp.data;
            int i=2;
            for (i=2; i<data; i++){
                if (data%i == 0){
                    break;
                }
            }
            if (data == i){
                countPrime++;
            }
            temp = temp.next;
        }
        return countPrime;
    }


    // display
    public void display(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
