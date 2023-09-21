package org.example.ejemploLinkedList;


public class MainExcersice {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.addAtIndex(1, 2);

        System.out.println("---el indicide indicado tiene el número: -----------");
        System.out.println(list.searchByIndex(2));

        //list.deleteAtIndex(1);
        System.out.println("----tiene el valor indicado?--------------");
        System.out.println(list.haveTheValue(5));

        System.out.println("--------------lista completa------------");
        list.showLinkedList(list);

        list.deleteLastNode(list);
        System.out.println("--------------lista dsps de eliminando el último nodo------------");
        list.showLinkedList(list);

    }
}
