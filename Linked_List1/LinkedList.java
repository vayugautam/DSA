public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;
    
        //Methods
        
        public void addFirst(int data) {//O(1)
            //step 1 = create new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //step 2 = newNode's next = head
            newNode.next = head;
            //step 3 = head = newNode
            head = newNode;
        }
        public void addLast(int data) { //O(1)
            //step 1 = create new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //step 2 = newNode's next = head
            tail.next = newNode;
            //step 3 = head = newNode
            tail = newNode;
        }
        public void print() {//O(n)
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void add(int index,int data) {
            if (index==0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while (i<index-1) {
                temp = temp.next;
                i++;
            }
            //i=index-1; temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public int removeFirst() {
            if (size==0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size==1) {
                int val = head.data;
                head = tail = null;
                size=0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (size==0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if (size==1) {
                int val = head.data;
                head=tail=null;
                size=0;
                return val;
            }
            // previous : i = size-2
            Node prev = head;
            for(int i = 0;i<size-2;i++){
                prev=prev.next;
            }
            int val = prev.next.data; // tail.data
            prev.next=null;
            tail = prev;
            size--;
            return val;
        }
        public int itrSearch(int key) {//O(n)
            Node temp = head;
            int i = 0;

            while (temp != null) {
                if (temp.data == key) {//key found
                    return i;
                }
                temp = temp.next;
                i++;
            }
            //key found
            return -1;
        }
        public int helper(Node head,int key) {
            if (head==null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx==-1) {
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key) {
            return helper(head,key);
        }

        public void reverse() {//O(n)
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast!=null && fast.next != null) {
                slow = slow.next;//+1
                fast = fast.next.next;//+2
            }
            return slow;
        }
        public boolean checkPalindrome() {
            //edge case 
            if (head==null || head.next==null) {
                return true;
            }
            //step1 - find mid
            Node midNode = findMid(head);
            //step2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while (curr!=null) {
                next = curr.next;
                curr.next=prev;
                prev = curr;
                curr = next;
            }
            //when curr = null then head of reversed ll will be the prev
            Node right = prev;//right half head
            Node left = head;
            //step3 - check left & right half
            while (right!=null) {
                if (left.data!=right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true; // cycle exists
                }
            }

            return false;
        }
        public static void removeCycle() {
            //detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycleexists = false;
            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
                if (fast==slow) {
                    cycleexists=true;
                    break;
                }
            }
            if (cycleexists==false) {
                return;
            }
            //find 2nd meeting point
            slow=head;
            Node prev = null;
            while (slow!=fast) {
                slow=slow.next;
                prev=fast;
                fast=fast.next;
            }
            //prev is the pervious of fast when fast and slow is at same node
            //remove cycle -> last.next = null
            prev.next=null;
        }
        private Node getmid(Node head){
            Node slow = head;
            Node fast = head.next;
            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        private Node merge(Node h1,Node h2){
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;
            while (h1!=null && h2!=null) {
                if (h1.data<=h2.data) {
                    temp.next=h1;
                    h1 = h1.next;
                    temp=temp.next;
                }else{
                    temp.next = h2;
                    h2 = h2.next;
                    temp = temp.next;
                }
            }
            while (h1!=null) {
                temp.next=h1;
                h1 = h1.next;
                temp=temp.next;
            }
            while (h2!=null) {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
            return mergedLL.next;
        }
        public Node mergeSort(Node head){
            //edge case
            if (head==null || head.next==null) {
                return head;
            }
            //find mid
            Node mid = getmid(head);
            //left & right MS
            Node righthead = mid.next;
            mid.next=null;
            Node newLeft = mergeSort(head);
            Node newright = mergeSort(righthead);
            //merge
            return merge(newLeft,newright);
        }
        public void ZigZag() {
            //find mid
            Node slow = head;
            Node fast= head.next;
            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid = slow;
            //reverse second half
            Node curr = mid.next;
            mid.next=null;
            Node prev = null;
            Node next;
            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL,nextR;

            // alt merge - zig - zag merge
            while (left!=null && right!=null) {
                nextL = left.next;
                left.next=right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            //1->2->3->4->5
            ll.print();
            ll.ZigZag();
            ll.print();
        } 
}