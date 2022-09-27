
public class LinkedList{

    public static void main(String args[]){
        LinkedList obj= new LinkedList();
        Node n1=new Node(3); Node head=n1;
        Node n2=new Node(2);
        Node n3=new Node(1);
        Node n4=new Node(4);
        Node n5=new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        Node current = head;
        Node tempNext=head.next;
        while (current != null&&tempNext!=null) {
            if(current.value<tempNext.value){
               current= obj.swap(current.value, tempNext.value, head);
               head= current;
            }else if(tempNext.next==null){
                current=current.next;
                tempNext= current.next;
            }else{
                tempNext= tempNext.next;
            }
        }
//                obj.swap(1,3,head);
//        Node tempHead=head,current=head;
//        while(current!=null){
//            if(current.next!=null&&(current.value<=current.next.value)){
//                current=current.next;
//            }else{
//                obj.swap(current.value, current.next.value, head);
//                current=head;
//            }
//        }
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
    public Node swap(int i,int j,Node nhead){
        Node iX=nhead,prevX=null;
        Node jY=nhead,prevY=null;
        while(iX!=null){
            if(iX.value==i&&iX.value!=j){
                break;
            }else{
                prevX=iX;
                iX=iX.next;
            }
        }
        while(jY!=null){
            if(jY.value==j&&jY.value!=i){
                break;
            }else{
                prevY=jY;
                jY=jY.next;
            }
        }

        if(iX!=null&&iX.next == jY){
            Node temp=jY.next;
            jY.next=iX;
            iX.next=temp;
            if(prevX!=null){
                prevX.next=jY;
            }else{
                nhead=jY;
            }
        }else{
            Node temp=jY.next;
            jY.next=iX.next;
            iX.next=temp;
            if(prevY!=null){prevY.next=iX;}
            if(prevX!=null){
                prevX.next=jY;
            }else{
                nhead=jY;
            }
        }
        System.out.println(nhead);
        return nhead;
    }
}

