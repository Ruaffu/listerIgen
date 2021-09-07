public class Liste
{
    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public Node insertFromHead(Node n){
        if (isEmpty()){
            head = n;
            tail = n;
            return head;
        }
        head.previous = n;
        n.next = head;
        head = n;

        return head;

    }

    public String printFromHead() {
        Node n = head;

        String s = "";
        if (isEmpty()){
            return s;
        }

        while (n != null){

            s += n.data;
            n = n.next;

        }
        return s;
    }

    public Node insertFromTail(Node node) {
        if (isEmpty()){
            head = node;
            tail = node;
            return tail;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;
        return tail;

    }

    public String printFromTail()
    {
        Node n = tail;

        String res = "";
        while (n != null)
        {
            res = res + n.data;
            n = n.previous;

        }
        return res;
    }
}
