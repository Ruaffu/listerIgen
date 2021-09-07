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

}
