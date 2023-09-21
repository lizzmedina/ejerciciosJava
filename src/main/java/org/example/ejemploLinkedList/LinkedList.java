package org.example.ejemploLinkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAtIndex(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if  (index == 0) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException();
                }
                current = current.next;
            }
            if( current.next == null ){
                addLast(value);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }
    public int searchByIndex (int index) {
        if (index < 0){
            throw  new IllegalArgumentException("no se permiten valores negativos, el indice debe ser a partir de cero");
        }else {
            Node current = head;

            for (int i = 0; i < index; i++){
                if (current == null) {
                    throw new IndexOutOfBoundsException("Índice fuera de los límites: " + index);
                }
                current = current.next;
            }
            return current.value;
        }
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        previous.next = current.next;
    }

// contiene un valor determinado ?  => boolean (value)

    public boolean haveTheValue (int value) {

        if (value < 0){
            throw  new IllegalArgumentException("no se permiten valores negativos");
        }

        Node current = head;

        while(current != null) {
            if (value == current.value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //remplazar nodo:

    public void replaceAtIndex(int index, int newValue) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        current.value = newValue;
    }

    //imprimir toda la lista de nodos

    public void showLinkedList (LinkedList list) {

        if (list == null){
            throw  new IllegalArgumentException("no se permiten valores negativos");
        }

        Node current = list.head;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("La lista está vacía, no se puede eliminar el primer elemento.");
        }
        head = head.next;
    }

    // borrar ultimo nodo de la lista:

    public void deleteLastNode(LinkedList list) {
        if (list == null || list.head == null) {
            throw new IllegalArgumentException("La lista está vacía o es nula");
        }
        Node current = list.head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            list.head = null;
        } else {
            previous.next = null;
        }
    }
}