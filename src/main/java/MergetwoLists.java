public class MergetwoLists {
    public static void main(String args[]){
        Node n1=new Node(1);
        Node n2=new Node(3);n1.next=n2;
        Node n3=new Node(5);n2.next=n3;
        Node n4=new Node(7);n3.next=n4;
        Node head1=n1;
        Node n5=new Node(2);//n4.next=n5;
        Node n6=new Node(4);n5.next=n6;
        Node n7=new Node(6);n6.next=n7;
        Node head2=n5;
        MergetwoLists.merge(head1,head2);
    }
    public static void merge(Node head1,Node head2) {
        Node current1 = head1;
        Node current2 = head2;
        Node prev1 = null;
        Node tail = new Node(0);
        Node sortedNode = tail;
        while (current1 != null && current2 != null) {
            if (current1.value < current2.value) {
                sortedNode.next = current1;
                current1 = current1.next;
            } else {
                sortedNode.next = current2;
                current2 = current2.next;
            }
            sortedNode = sortedNode.next;
        }
    }
}
