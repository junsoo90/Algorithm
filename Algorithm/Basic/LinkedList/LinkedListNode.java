package Algorithm.Basic.LinkedList;

class LinkedListNode {
    Object data;
    LinkedListNode link;

    LinkedListNode(){
        link = null;
    }
    LinkedListNode(Object data){
        this.data = data;
    }
    LinkedListNode(Object data, LinkedListNode link){
        this.data = data;
        this.link = link;
    }
}