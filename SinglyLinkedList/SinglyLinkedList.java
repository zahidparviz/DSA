/*
 * Steps to Create a Single LinkedList with one node
 * 
 * step # 1 
 * 
 * create head and tail and initialize them with null
 * 
 * step # 2
 * 
 * assign node value to nodeValue & and next reference to null as there is only one element
 * 
 * step # 3
 * 
 * Link head and tail with the node
 */




public class SinglyLinkedList {
    public Node head;
    public Node tail;
    int size;

    public Node creatSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();

        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = null;
        size = 1;
        
        return head;
    }

    public void insertSingleElement(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if(head == null) {                  // if linkedlist is not already created
            creatSingleLinkedList(nodeValue);
            return;
        } else if(location == 0) {          // inserting value at beginning of linkedlist
            node.next = head;
            head = node;
        } else if(location > size) {        // if location is greator than the size of linkedlist
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head; 
            int index = 0;

            while(index < location -1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}