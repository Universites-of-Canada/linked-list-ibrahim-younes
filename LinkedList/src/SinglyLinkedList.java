public class SinglyLinkedList<E> {
    protected Node<E> head = null;
    protected Node<E> tail = null;
    protected int size = 0;

    private static class Node<E>{
        E element;
        Node<E> pointer;

        public Node(E element, Node<E> pointer) {
            this.element = element;
            this.pointer = pointer;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPointer() {
            return pointer;
        }

        public void setPointer(Node<E> pointer) {
            this.pointer = pointer;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
       return size == 0;
    }

    public Node<E> first() {
        if (head != null) {
            return head;
        }
        return null;
    }

    public Node <E>last(){
        if (tail != null){
            return tail;
        }
        return null;
    }

    public void addLast(){
        Node<E> newest = null;
        if (isEmpty()){
            head = newest;
        }
        size++;
    }

    public void addFirst(E element){
        head = new Node<>(element,head);
        if (isEmpty()){
            tail = head;
        }
    }

    public Node<E> removeFirst(){
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = head.getPointer();
        E element = temp.getElement();
        head = null;
        size--;
        return temp;
    }
    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.getElement() + " ");
            current = current.getPointer();
        }
    }
}

