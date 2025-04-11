package DSA_Lab;

public class FixedQueue {
    int[] queue = new int[5];
    int front = -1,rear = -1;
    
    void enqueue(int item){
        if(rear == 4){
            System.out.println("Queue Overflow, Cannot insert: " + item);
        } else {
            if (front == -1) front = 0;
            queue[++rear] = item;
            System.out.println("Inserted: " + item);
        }
    }
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow.");
        } else {
            System.out.println("Deleted: " + queue[front++]);
            if(front > rear) {
                front = rear = -1;
            }
        }
    }

    void display(){
        if ( front == -1){
            System.out.println("Queue is Empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FixedQueue q = new FixedQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); // queue full here
        q.enqueue(60); // should show overflow

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();
        q.enqueue(60); // even though there’s space at start, queue is full (linear)
        q.display();
    }
}

