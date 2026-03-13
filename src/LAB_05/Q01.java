package LAB_05;

interface QueueImpl{
    void insert(int x);
    void delete();
    void display();
}

class QueueDemo implements QueueImpl{
    int[] queue = new int[10];
    int front = -1;
    int rear = -1;

    @Override
    public void insert(int x) {
        try {
            if(rear == 9)
            {
                throw new Exception("Queue Overflow");
            }

            if(front == -1)
                front = 0;

            rear++;
            queue[rear] = x;

            System.out.println("Inserted: " + x);
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete() {
        try {
            if(front == -1 || front > rear)
            {
                throw new Exception("Queue Underflow");
            }

            int item = queue[front];
            front++;

            System.out.println("Deleted: " + item);
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        if(front == -1 || front > rear)
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements are:");

        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}

public class Q01 {
    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        q.insert(10);
        q.insert(20);
        q.insert(30);

        q.display();

        q.delete();
        q.display();

        q.insert(40);
        q.insert(50);

        q.display();
    }
}
