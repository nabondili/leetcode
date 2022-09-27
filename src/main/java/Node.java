public class Node implements Cloneable{
    int value;
    Node next;
    Node(int value){
        this.value=value;
        this.next=null;
    }
    boolean hasNext(){
        if(this.next!= null){ return true;}
        return false;
    }
    public Node clone(){
        return this.clone();
    }
}
