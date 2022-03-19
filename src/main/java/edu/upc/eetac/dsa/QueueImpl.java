package edu.upc.eetac.dsa;

public class QueueImpl<E> implements Queue<E> {
    private E[] vector;
    private int max;
    private int lib;

    public QueueImpl(int max) {
        this.vector = (E[]) new Object[max];
        this.max = max;
        this.lib = 0;
    }

    public void push(E e) throws FullQueueException {
        if (this.lib < this.max) {
            this.vector[this.lib] = e;
            ++this.lib;
        } else {
            throw new FullQueueException();
        }
    }


    public E pop() throws EmptyQueueException {
        if (this.lib == 0) {
            throw new EmptyQueueException();
        } else {
            this.vector[0] = null;

            for(int i = 0; i < this.lib - 1; ++i) {
                this.vector[i] = this.vector[i + 1];
            }

            this.vector[this.lib - 1] = null;
            --this.lib;
            return this.vector[this.lib];
        }
    }
    public E ensenar(int pos) {
        return this.vector[pos];
    }

    public int size() {
        return this.vector.length;
    }
}
