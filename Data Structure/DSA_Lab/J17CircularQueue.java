package DSA_Lab;

public class J17CircularQueue {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(3);
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove());
        q.add(40);
        System.out.println(q.remove());
        q.add(50);
        q.add(60);
        // while (!q.isEmpty()) {
        // System.out.print(q.peek() + " ");
        // q.remove();
        // }
        System.out.println("-----------------------");
        int i = q.front;
        while (true) {
            System.out.println(q.arr[i] + "  ");
            if (i == q.rear) {
                break;
            }
            i = (i + 1) % q.size;
        }
    }
}