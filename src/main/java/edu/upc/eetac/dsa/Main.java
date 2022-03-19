package edu.upc.eetac.dsa;

public class Main {
    public static void main(String[] args) {
        QueueImpl q = new QueueImpl(5);

        try {
            q.push(3);
            q.push(6);
            q.push(2);
            q.push(7);
            q.push(1);
        } catch (FullQueueException var4) {
            var4.printStackTrace();
        }

        try {
            System.out.println("Position 1 = " + q.ensenar(0));
            System.out.println("Position 2 = " + q.pop());
            System.out.println("Position 3 = " + q.pop());
            System.out.println("Position 4 = " + q.pop());
            System.out.println("Position 5 = " + q.pop());
        } catch (EmptyQueueException var3) {
            var3.printStackTrace();
        }

        System.out.println("Size = " + q.size());
    }
}
