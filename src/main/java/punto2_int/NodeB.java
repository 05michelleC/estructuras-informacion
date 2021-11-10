package punto2_int;

/**
 *
 * @author Michelle
 */
public class NodeB {

    NodeB next, prev;
    Object val;

    public NodeB() {

        this.next = null;
        this.prev = null;
        this.val = null;
    }

    public NodeB(Object val, NodeB first, NodeB last) {

        this.next = first;
        this.prev = last;
        this.val = val;
    }

    public NodeB getNext() {
        return next;
    }

    public void setNext(NodeB next) {
        this.next = next;
    }

    public NodeB getPrev() {
        return prev;
    }

    public void setPrev(NodeB prev) {
        this.prev = prev;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

}
