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

//    public Node removeFromHead() {
//        if (isEmpty()){
//            return null;
//        }
//
//        Node n = head;
//        head.next.previous = null;
//        head = head.next;
//
//        return n;
//    }

    public Node removeFromHead()
    {
        Node node = new Node("");
        if (isEmpty()){
            return node;
        }

        if (head == tail){
            node = head;
            head = null;
            tail = null;
            return node;
        }
         node = head;
         head = head.next;
         head.previous.next = null;
         head.previous = null;

         return node;

    }

    public Node removeFromTail()
    {
        Node node = new Node("");
        if (isEmpty()){
            return node;
        }

        if (head == tail){
            node = tail;
            head = null;
            tail = null;
            return node;
        }
        node = tail;
        tail.previous.next = null;
        tail = tail.previous;

        return node;
    }


    public Node findNode(int i) {
        int in = 0;
        Node node = head;

        while (node != null && in <= i){
            in++;
            if (in == i){
                return node;
            }
            node = node.next;
        }

        return new Node("");
    }

    public Node removeNode(Node node){

        if (head == node){
            removeFromHead();
        }

        else if (tail == node){
            removeFromTail();
        }else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        return node;
    }

    public Node findNodeByString(String s) {

        Node node = head;

        while (node != null){
            if (node.data.equals(s)){
                return node;
            }
            node = node.next;
        }

        return new Node("");
    }

    public void insertNodeByIndex(int index, Node n){
        Node node = findNode(index);

        if (head == node){
            insertFromHead(n);
        }
        else if (tail == node){
            insertFromTail(n);
        }else{
            n.next = node;
            n.previous = node.previous;

            node.previous.next = n;
            node.previous = n;

        }


    }



}
