import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKlists {
    public static class Node{
        int value;
        Node next;
        Node(int n){
            this.value=n;
            this.next=null;
        }

    }

    public static void main(String args[]){
        //[-10,-10,-9,-4,1,6,6]
        //[-7]
        Node n1=new Node(-10);
        Node n2=new Node(-10);n1.next=n2;
        Node n3=new Node(-9);n2.next=n3;
        Node n4=new Node(-4);n3.next=n4;
        Node n5=new Node(6);n4.next=n5;
        Node n6=new Node(6);n5.next=n6;
        Node m1=new Node(-7);
//        m2.next=m3;
//        Node m4=new Node(1);m3.next=m4;
        List<Node> lists= new ArrayList<>();
        lists.add(n1);
        lists.add(m1);
        PriorityQueue<Node> pq=new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value- o2.value;
            }
        });
        for(Node l: lists){
            while(l!=null){
                pq.add(l);
                l=l.next;
            }
        }
//        pq.poll();
        Node result= new Node(0);
        Node head=result;
//        result=resu;
        while(!pq.isEmpty()){
            result.next=pq.poll();
            result=result.next;

        }
        result.next=null;
        System.out.println(head.next);

    }
}
