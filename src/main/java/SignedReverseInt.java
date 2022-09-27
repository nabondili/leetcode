public class SignedReverseInt {
    public static void main(String args[]){
        SignedReverseInt signedReverseInt= new SignedReverseInt();
//        int value= signedReverseInt.reverse(9646324351);
//        System.out.print(value);
    }
    public int reverse(int n){
        StringBuilder sb= new StringBuilder();
        sb.append(n);
        if(n<0){
            int val=Integer.parseUnsignedInt(sb.toString().substring(1,sb.toString().length()));
            StringBuilder sb2= new StringBuilder();
            sb2.append(val).reverse();
            return Integer.parseInt(sb2.toString()) *-1;
        }
       return Integer.parseUnsignedInt(sb.reverse().toString());
//        return n;

    }
}
