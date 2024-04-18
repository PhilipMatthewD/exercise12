class myQueue<E> {
    private E[] elements;
    private int index = 0;
    private int size;

    public myQueue(int size) {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    public void enqueue(E element ) throws StackFullException {
        if (index >= size) {
            throw new StackFullException();
        }

        elements[index] = element;
        index++;
    }

    public E dequeue() throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();
        }

        E returnElement = elements[index - 2];
        index++;
        return returnElement;
    }
}