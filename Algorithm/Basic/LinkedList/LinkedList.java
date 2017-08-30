package Algorithm.Basic.LinkedList;


class LinkedList {
    LinkedListNode root;
    static int size;

    LinkedList() {
        root = new LinkedListNode();
        root = null;
        size = 0;
    }

    // 맨앞에 추가
    public void firstadd(Object o) {
        LinkedListNode newnode = new LinkedListNode(o);

        if (root == null) {
            root = newnode;
        } else {
            LinkedListNode current = root;
            newnode.link = current;
            root = newnode;
        }
        size++;
    }

    // 맨뒤에 추가
    public void lastadd(Object o) {

        LinkedListNode newnode = new LinkedListNode(o);
        LinkedListNode current = root;

        if (root == null) {
            root = newnode;
            return;
        }
        while (current.link != null) {
            current = current.link;
        }
        current.link = newnode;
        size++;
    }

    // 특정 index? list다음에 추가
    public void add(Object o, LinkedListNode l) {
        LinkedListNode newnode = new LinkedListNode(o);
        LinkedListNode current = root;

        while (current.link == l) {
            current = current.link;
        }
        current.link = newnode;
        newnode.link = current.link.link;
        size++;
    }

    // 맨앞 삭제
    public void firstremove() {
        if (root == null) {
            System.out.println("리스트가 비었어");
            return;
        } else {
            root = root.link;
        }
    }

    // 맨뒤 삭제
    public void lastremove() {
        LinkedListNode current = root.link;
        LinkedListNode precurrent = root;
        while (current.link != null) {
            precurrent = current;
            current = current.link;
        }
        precurrent.link = null;
        size--;
    }

    // 특정  index? list다음꺼삭제
    public void remove(LinkedListNode l) {
        LinkedListNode current = root;
        while (current.link == l) {
            current = current.link;
        }
        current.link = current.link.link;
        size--;
    }

    // size();

    public int size() {
        return size;
    }

    // isEmpty
    public boolean isEmpty() {
        if (size() <= 0)
            return true;
        else
            return false;
    }

    // get(index)
    public void allget() {
        LinkedListNode current = root;
        while (current != null) {
            System.out.println(current.data);
            current = current.link;
        }
    }
}
