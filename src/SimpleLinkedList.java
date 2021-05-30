class NodeInt {
    int data;
    NodeInt next;

    NodeInt(int x) {
        data = x;
        next = null; //this line optional as in java an uninitialized variable becomes null by default
    }
}

class SimpleLinkedList {
    public static void main(String[] args) {
        NodeInt head = new NodeInt(1);
        NodeInt temp1 = new NodeInt(2);
        NodeInt temp2 = new NodeInt(3);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println(head.data + "->" + head.next.data + "->" + head.next.next.data);
    }
}
