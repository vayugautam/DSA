public class circularQusingArray {
    static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //adding the first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int frontElement = arr[front];
            // If removing the last element
            if (front == rear) {
                // Reset the queue
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return frontElement;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
