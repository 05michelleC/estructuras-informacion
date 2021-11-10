package Punto2_int;

/**
 *
 * @author Reinel
 */
interface Queue {

    public class DLDqueue implements Queue {

        NodeB head, tail;
        int size;

        public DLDqueue() {
            head = new NodeB();
            tail = new NodeB();
            head.setNext(tail);
            tail.setPrev(head);
            size = 0;
        }

        public void insertFirst(Object obj) {
            NodeB h = head;
            NodeB nodo = new NodeB();
            nodo.setVal(obj);
            nodo.setNext(h);
            h.setPrev(nodo);
            head = nodo;
            if (size == 0) {
                tail = nodo;
            }
            size++;

        }

        public void insertLast(Object obj) {
            NodeB t = tail;
            NodeB nodo = new NodeB();
            nodo.setVal(obj);
            nodo.setPrev(t);
            t.setNext(nodo);
            tail = nodo;
            if (size == 0) {
                head = nodo;
            }
            size++;
        }

        public Object removeFirst() {
            if (head == null) {
                return null;
            }
            Object val = head.getVal();
            head = head.getNext();
            size--;
            return val;
        }

        public Object removeLast() {
            if (tail == null) {
                return null;
            }
            Object val = tail.getVal();
            tail = tail.getPrev();
            size--;
            return val;
        }

        public int size() {
            return size;
        }

        public String toString() {
            String s = "head [";
            NodeB aux = head;
            for (int i = 0; i < size; i++) {
                s += aux.getVal();
                if (aux == tail) {
                    break;
                }
                s += "-";
                aux = aux.getNext();
            }
            return s + "] tail";

        }
    }
}
