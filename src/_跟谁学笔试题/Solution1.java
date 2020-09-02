package _跟谁学笔试题;

class Node{
    int data;
    Node next;

    public Node(int i) {
        this.data = i;
    }

    class Soluton{
        public Node mergetTwoLists(Node n1,Node n2){
            if(n1==null)
                return n2;
            if(n2 ==null)
                return n1;
            Node dummy = new Node(-1);
            Node cur = dummy;
            while(n1!=null &&n2!=null){
                if(n1.data<n2.data){
                    cur.next = n1;
                    n1 = n1.next;
                    cur = cur.next;
                }
                else{
                    cur.next = n2;
                    n2 = n2.next;
                    cur = cur.next;
                }

            }
            if(n1==null)
                cur.next = n2;
            else
                cur.next = n1;

            return dummy.next;
        }
    }
}

