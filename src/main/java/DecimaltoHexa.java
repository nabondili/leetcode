import java.util.Stack;

public class DecimaltoHexa {
    public static void main(String args[]){
        double val=479;
        Stack s= new Stack();
        while(val>0){
            val=val%16;
            System.out.println(val);
            s.push(Math.floor(val));
        }
    }
}
