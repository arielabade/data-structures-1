package Java.DoubleLinkedList.LeetCode.swapFirstAndLast;

public class DoublyLinkedList  {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    
    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void swapFirstLast() {
        
        if(length < 2) {
            return ;
        } else {
            int temp = head.value; //its just a int pointer
            head.value = tail.value;  // copia o valor do tail
            tail.value = temp; //define o valor do tail para o valor armazenado no nó temporário
            
            // se copiar direto o valor do tail pro head, ambos os valores ficarão iguais e o valor do head não será armazenado para haver o ajuste de ponteiros depois
             
            // é a mesma coisa de dizer: head.value = tail .value
            //mas de um jeito mais complexo
        }
    }

}

