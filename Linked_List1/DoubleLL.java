public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev=tail;
        tail = newNode;
    }
    //removeFirst
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    // removeLast
    public int removeLast(){
        if (size==0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next =  null;
        size--;
        return val;
    }
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            //updation
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
    }
}
