public class ReverseKlinkedList {
        static class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        public static void main(String args[]){
            ReverseKlinkedList k=new ReverseKlinkedList();
            Node n1=new Node(1);
            Node n2=new Node(2);n1.next=n2;
            Node n3=new Node(3);n2.next=n3;
            Node n4=new Node(4);n3.next=n4;
            Node n5=new Node(5);n4.next=n5;
            Node n6=new Node(6);n5.next=n6;
            Node n7=new Node(7);n6.next=n7;
            Node mainHead=n1;int i=0;
            Node current=mainHead;
            Node newHead=mainHead;
           while(current!=null){
               current=current.next;
               i++;
               if(i==3){
                   newHead=k.reverseK(newHead,i);
               }
           }
        }

        private Node reverseK(Node head,int k) {
            Node newHead=head;
            Node current=head;
            Node prev=null;
            while(current!=null&&k>0){
                Node temp=current.next;
                current.next=prev;
                prev=current;
                current=temp;
                k--;
            }
            newHead=new Node(0);
            Node t=newHead;

            while(prev!=null){
                newHead.next=prev;
                prev=prev.next;
                newHead=newHead.next;
            }
            newHead.next=current;
            return t.next;
        }
}
